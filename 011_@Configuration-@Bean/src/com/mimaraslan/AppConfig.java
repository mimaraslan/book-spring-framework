package com.mimaraslan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="selam")
    public ISelam mesajYaz() {
        return new SelamImpl();
    }
}

