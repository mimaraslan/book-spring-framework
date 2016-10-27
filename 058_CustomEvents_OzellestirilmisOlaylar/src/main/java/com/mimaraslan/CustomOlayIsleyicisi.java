package com.mimaraslan;

import org.springframework.context.*;

public class CustomOlayIsleyicisi 
   implements ApplicationListener<CustomOlay>{							

   public void onApplicationEvent(CustomOlay event) {
      System.out.println(event.toString());
   }
}