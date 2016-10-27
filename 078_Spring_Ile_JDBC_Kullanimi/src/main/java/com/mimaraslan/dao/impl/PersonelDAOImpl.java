package com.mimaraslan.dao.impl;

import com.mimaraslan.dao.PersonelDAO;
import com.mimaraslan.enterprise.Personel;

import java.sql.*;
import javax.sql.*;

public class PersonelDAOImpl implements PersonelDAO
{

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
		Connection baglanti = null;
 
		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement preparedStatement;
			preparedStatement = baglanti.prepareStatement(sqlKodu);
			preparedStatement.setString(1, personel.getAdi());
			preparedStatement.setString(2, personel.getSoyadi());
			preparedStatement.setInt(3, personel.getTecrube());
			preparedStatement.executeUpdate();
			preparedStatement.close();
 
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
 //-----------------------------------------		
	@Override
	public Personel idAra(int id) {
		sqlKodu = "SELECT * FROM personel WHERE id = ?";

		try {
			baglanti = veriKaynagi.getConnection();
			PreparedStatement preparedStatement;
			preparedStatement = baglanti.prepareStatement(sqlKodu);

			preparedStatement.setInt(1, id);
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
}


























