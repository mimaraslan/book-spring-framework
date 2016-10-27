package com.mimaraslan;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextOlayBaslatmaIsleyicisi 
   implements ApplicationListener<ContextStartedEvent>{						

   public void onApplicationEvent(ContextStartedEvent event) {
	   
      System.out.println("ContextStartedEvent "
    		  			+ "(Context Olay Başlatma)");
   }
}