package com.zmk.library.lib.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class AProperties {
	private String aMessage;

	public String getaMessage() {
		return aMessage;
	}

	public void setaMessage(String aMessage) {
		this.aMessage = aMessage;
	}
	

}
