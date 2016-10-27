package com.mimaraslan;

import com.mimaraslan.Daire;
import com.mimaraslan.Dortgen;

public class UygulamaMerkez {
	public static void main(String[] args) {
		
		Sekil sekil;
	
		sekil = new Dortgen();
		sekil.ciz(sekil);

		sekil = new Daire();
		sekil.ciz(sekil);		
	}
}


