package com.mimaraslan;

import org.springframework.context.ApplicationEvent;

public class CustomOlay extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public CustomOlay(Object source) {
		super(source);
	}

	public String toString() {
		return "Custom Event (Özelliştirilmiş Olay)";
	}
}


