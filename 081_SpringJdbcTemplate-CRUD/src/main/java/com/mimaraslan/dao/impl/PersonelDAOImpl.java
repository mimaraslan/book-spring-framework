package com.mimaraslan.dao.impl;

import com.mimaraslan.dao.PersonelDAO;
import com.mimaraslan.pojo.Personel;

import java.sql.*;
import java.util.*;
import javax.sql.*;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PersonelDAOImpl implements PersonelDAO {				

	private DataSource veriKaynagi;
	// ----------------------------------------
	public void setVeriKaynagi(DataSource veriKaynagi) {
		this.veriKaynagi = veriKaynagi;
	}
	// -----------------------------------------
	
	@Override
	public void craateOlustur1(Personel personel) {
		String sorgu = "INSERT INTO personel (adi, soyadi, tecrube) "
				+ " VALUES ( ? ,     ? ,     ?)";
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			ps.setString(1, personel.getAdi());
			ps.setString(2, personel.getSoyadi());
			ps.setInt(3, personel.getTecrube());

			int durum = ps.executeUpdate();
			if (durum != 0) {
				System.out.println("id değeri " + personel.getId() 
						+ " olan kayıt eklendi.\n");
			} else {
				System.err.println("id değeri " + personel.getId() 
						+ " olan kayıt eklendi.\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	// -----------------------------------------
	
	  @Override
	    public void craateOlustur2(Personel personel) {
	    	String sorgu = "INSERT INTO personel (adi, soyadi, tecrube) "
	    				 + " VALUES ( ? ,     ? ,     ?)";
	         
	        JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
	         
	        Object[] args = new Object[] {personel.getAdi(), 
	        							  personel.getSoyadi(), 
	        							  personel.getTecrube() };
	         
	        int durum = jdbcTemplate.update(sorgu, args);
	         
	    	if (durum != 0) {
				System.out.println("id değeri " + personel.getId() 
						+ " olan kayıt eklendi.\n");
			} else {
				System.err.println("id değeri " + personel.getId() 
						+ " olan kayıt eklendi.\n");
			}
	    }
// -----------------------------------------	
	  
	@Override
	public Personel readOku1(int id) {
		String sorgu = "SELECT * FROM personel WHERE id = ?";
		Personel personel = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				personel = new Personel();
				//personel.setId(rs.getInt("id"));
				personel.setAdi(rs.getString("adi"));
				personel.setSoyadi(rs.getString("soyadi"));
				personel.setTecrube(rs.getInt("tecrube"));
System.out.println("ID : " + rs.getInt("id") 
+ " - ADI SOYADI : " + rs.getString("adi")+ " " +rs.getString("soyadi")
+ " - İŞ TECRÜBESİ : " + rs.getInt("tecrube") + " yıl \n");
			} else {
				System.err.println("id değeri " 
			+ id	+ " olan kayıt bulunamadı.\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personel;
	}
// -----------------------------------------
	
@Override
 public Personel readOku2(int id) {
	   String sorgu = "SELECT * FROM personel WHERE id = ?";
	   JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
	         
 //RowMapper'ı tekrar kullanmak için anonymous sınıf kullandık.      
	     try {			
	        Personel personel = jdbcTemplate.queryForObject(
	        sorgu, new Object[]{id}, new RowMapper<Personel>(){ 		
	        	
	        @Override
	        public Personel mapRow(ResultSet rs, int rowNum)
	        							  throws SQLException {	            	
	                Personel personel = new Personel();	                
	                personel.setId(rs.getInt("id"));
	                personel.setAdi(rs.getString("adi"));
	                personel.setSoyadi(rs.getString("soyadi"));
	                personel.setId(rs.getInt("tecrube"));
	                
System.out.println("ID : " + rs.getInt("id") 
+ " - ADI SOYADI : "+ rs.getString("adi") 
+ " " + rs.getString("soyadi")
+ " - İŞ TECRÜBESİ : " + rs.getInt("tecrube") + " yıl \n");
	                
	                return personel;
	            }});
	         
	        return personel;
    		}catch (Exception e) {
    			System.out.println("null\n");
    			return null;
    		}
	    }
// -----------------------------------------  
	  
	@Override
	public void updateGuncelle1(Personel personel, int id) {
		String sorgu = "UPDATE personel "
					+ "SET adi=?, soyadi=?, tecrube=? "
				   	+ "WHERE id=?";		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			ps.setString(1, personel.getAdi());
			ps.setString(2, personel.getSoyadi());
			ps.setInt(3, personel.getTecrube());
			ps.setInt(4, id);			
System.out.println("ID : " + id + " - ADI SOYADI : "
+ personel.getAdi() + " " + personel.getSoyadi()
+ " - İŞ TECRÜBESİ : " + personel.getTecrube() + " yıl ");		
			int durum = ps.executeUpdate();		
			if (durum != 0) {
		System.out.println("id değeri " + id
						+ " olan kayıt güncellendi.\n");
			} else
		System.err.println("id değeri " + id
					+ " olan kayıt güncellenemedi.\n");			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
// -----------------------------------------  
	
@Override
public void updateGuncelle2(Personel personel, int id) {
	
String sorgu = "UPDATE personel "
		+ "SET adi=?, soyadi=?, tecrube=? "
		+ "WHERE id=?";

JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);

	  Object[] args = new Object[] {personel.getAdi(), 
	        						personel.getSoyadi(), 
	        					    personel.getTecrube(), 
	        						 id};
	         
	        int durum = jdbcTemplate.update(sorgu, args);
	        if (durum != 0) {
				System.out.println("id değeri " + id
					+ " olan kayıt güncellendi.\n");
			} else
				System.err.println("id değeri " + id
					+ " olan kayıt güncellenemedi.\n");
	    }
// -----------------------------------------  

	@Override
	public void deleteSil1(int id) {
		String sorgu = "DELETE FROM personel WHERE id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			ps.setInt(1, id);
			int durum = ps.executeUpdate();
			if (durum != 0) {
				System.out.println("id değeri " 
			+ id + " olan kayıt silindi.");
			} else
				System.err.println("id değeri " 
			+ id + " olan kayıt silinemedi.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}	
// -----------------------------------------  
	
@Override
public void deleteSil2(int id) {
	 
String sorgu = "DELETE FROM personel WHERE id=?";
JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
	         
	int durum = jdbcTemplate.update(sorgu, id);
	if (durum != 0) {
		System.out.println("id değeri " 
				+ id + " olan kayıt silindi.");
	} else
		System.err.println("id değeri " 
				+ id + " olan kayıt silinemedi.");
} 
// -----------------------------------------   

	@Override
	public List<Personel> getAllHesiniGetir1() {
			
		String sorgu = "SELECT * FROM personel";
List<Personel> personelListesi = new ArrayList<Personel>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			rs = ps.executeQuery();
			while (rs.next()) {
			 Personel personel = new Personel();
			 personel.setId(rs.getInt("id"));
			 personel.setAdi(rs.getString("adi"));
			 personel.setSoyadi(rs.getString("soyadi"));
			 personel.setTecrube(rs.getInt("tecrube"));
			 personelListesi.add(personel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personelListesi;
	}	
// -----------------------------------------  

    @Override
    public List<Personel> getAllHesiniGetir2() {
    	
        String sorgu = "SELECT * FROM personel";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
        List<Personel> personelListesi = new ArrayList<Personel>();
 
        List<Map<String,Object>> personelKayitlar 
        						= jdbcTemplate.queryForList(sorgu);
         
        for(Map<String,Object> personelKayit : personelKayitlar){
            Personel personel = new Personel();
            personel.setId(Integer.parseInt(
            		String.valueOf(personelKayit.get("id"))));
            personel.setAdi(String.valueOf(
            		personelKayit.get("adi")));
            personel.setSoyadi(String.valueOf(
            		personelKayit.get("soyadi")));
            personel.setTecrube(Integer.parseInt(
            		String.valueOf(personelKayit.get("tecrube"))));
            personelListesi.add(personel);
        }
        return personelListesi;
    }
 	
}
















