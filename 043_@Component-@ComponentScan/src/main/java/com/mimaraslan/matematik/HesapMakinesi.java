package com.mimaraslan.matematik;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component("hesapMakinesiBeanComponent")																	
public class HesapMakinesi {
	
    private Islem islem;

    @Autowired
    public void setIslem(Islem islem) {
        this.islem = islem;
    }

    public void sonuclariGetir(int sayi1, int sayi2){
        System.out.println("TOPLA   = " + islem.topla(sayi1, sayi2));  
        System.out.println("ÇIKARMA = " + islem.cikar(sayi1, sayi2));  
        System.out.println("BÖLME   = " + islem.bol(sayi1, sayi2));  
        System.out.println("ÇARPMA  = " + islem.carp(sayi1, sayi2));  
    }
}