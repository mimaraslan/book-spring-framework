package com.mimaraslan;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextOlayDurdurmaIsleyicisi 
   implements ApplicationListener<ContextStoppedEvent>{					

   public void onApplicationEvent(ContextStoppedEvent event) {
      System.out.println("ContextStoppedEvent "
      		+ "(Context Olay Durudurma)");
   }
}