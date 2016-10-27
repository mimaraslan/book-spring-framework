package com.mimaraslan;

public class C {
	
	public C () {
		System.out.println("C sınıfının parametresiz "
							+ "hazırlayıcı metodu.\n\n");
	   }
	
	public C (A aNesnesi, B bNesnesi) {
		System.out.println("C sınıfının A ve B tipinde "
				+ "2 parametreli hazırlayıcı metodu.");
		
		aNesnesi.konsolaYaz();
		bNesnesi.sonucuGoster();
		
		System.out.println("\n");
	   }
	
	public C (String mesaj, int sayi) {
		System.out.println("C sınıfının "
				+ "String ve int tipinde "
				+ "2 parametreli hazırlayıcı metodu.\n\n");
		
		System.out.println(mesaj +  "  " + sayi);
	   }		
}





























