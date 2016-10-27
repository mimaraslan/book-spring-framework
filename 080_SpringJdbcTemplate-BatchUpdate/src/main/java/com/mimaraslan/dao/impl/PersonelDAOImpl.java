package com.mimaraslan.dao.impl;
import com.mimaraslan.dao.PersonelDAO;
import com.mimaraslan.enterprise.Personel;

import java.sql.*;
import java.util.*;

import javax.sql.*;

import org.springframework.jdbc.core.*;

public class PersonelDAOImpl implements PersonelDAO {
	
	private JdbcTemplate jdbcTemplate;									 		
	private Connection baglanti = null;
	private String sqlKodu = null;
	private DataSource veriKaynagi;	
//----------------------------------------	
	public void setVeriKaynagi(DataSource veriKaynagi) {
		this.veriKaynagi = veriKaynagi;
	}
//-----------------------------------------		
	@Override
	public void ekle(Personel personel){
		
		sqlKodu = "INSERT INTO personel " +
			"(adi, soyadi, tecrube) VALUES (?, ?, ?)";
	 
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
	 
		jdbcTemplate.update(sqlKodu, new Object[] { 
				personel.getAdi(), 
				personel.getSoyadi(), 
				personel.getTecrube()  
		});		
	}
 //-----------------------------------------
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Personel idAra(int id) {
		
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		
		sqlKodu = "SELECT * FROM personel WHERE id = ?";

Personel personel = (Personel) jdbcTemplate.queryForObject(
		sqlKodu, 
		new Object[] { id }, 
		new BeanPropertyRowMapper(Personel.class));
	 
		return personel;
	}
//-----------------------------------------	
	@Override
	public Personel adiAra(String adi) {	
		sqlKodu = "SELECT * FROM personel WHERE adi = ?";
		 
		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement preparedStatement;
			preparedStatement = baglanti.prepareStatement(sqlKodu);
			preparedStatement.setString(1, adi);
			Personel personel = null;
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				personel = new Personel(
					resultSet.getInt("id"),
					resultSet.getString("adi"),
					resultSet.getString("soyadi"), 
					resultSet.getInt("tecrube")
				);
			}
			resultSet.close();
			preparedStatement.close();
			return personel;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {}
			}
		}
	}

	@Override
	public Personel soyadiAra(String soyadi) {
		// Soyadına göre arama yapacak kodlar burada yer alacak.
		return null;
	}

	@Override
	public Personel tecrubeyeAra(int tecrube) {
		// Tecrübeye göre arama yapacak kodlar burada yer alacak.
		return null;
	}
	
@SuppressWarnings("rawtypes")
@Override
public List<Personel> butunKayitlariAra() {
			
 jdbcTemplate = new JdbcTemplate(veriKaynagi);									
 
 String sql = "SELECT * FROM personel";
		 
 List<Personel> personelListesi = new ArrayList<Personel>();
		 
 List<Map<String, Object>> satirlar = jdbcTemplate.queryForList(sql);
 
 for (Map satir : satirlar) {
	Personel personel = new Personel();
	personel.setId(Integer.parseInt(String.valueOf(satir.get("id"))));
	personel.setAdi((String) satir.get("adi"));
	personel.setSoyadi((String) satir.get("soyadi"));
personel.setTecrube(Integer.parseInt(String.valueOf(satir.get("tecrube"))));
	personelListesi.add(personel);
  }		 
	return personelListesi;
}	
	


	@Override
	public String idDegeriyleStringBirVeriyiCekme(int id) {
		
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		
		String sql = "SELECT soyadi FROM personel WHERE id = ?";
		
		String sonuc =(String) jdbcTemplate.queryForObject(
				sql, new Object[] { id },  String.class);

		return sonuc;
	}
//---------------------------------------------------		
@Override
public void topluVerisiGirisiBatch1(final List<Personel> personelListesi){

	jdbcTemplate = new JdbcTemplate(veriKaynagi);
	String sql = "INSERT INTO personel (adi, soyadi, tecrube) "
		  								+ "	VALUES (?, ?, ?)";		 
	jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
		 
		public void setValues(PreparedStatement preparedStatement, int i) 
													throws SQLException {
				Personel personel = personelListesi.get(i);
			 //id DEĞERİ OTOMATİK GİRİLECEĞİ İÇİN BURADA YER ALMIYOR.
				preparedStatement.setString(1, personel.getAdi());
				preparedStatement.setString(2, personel.getSoyadi() );
				preparedStatement.setInt(3, personel.getTecrube());
			}
		 
			public int getBatchSize() {
				return personelListesi.size();
			}
		});
	}
//-------------------------------------------	
	@Override
	public void topluVerisiGirisiBatch2(final String sql){
		jdbcTemplate = new JdbcTemplate(veriKaynagi); 
		jdbcTemplate.batchUpdate(new String[]{sql});	 
	}
}


























