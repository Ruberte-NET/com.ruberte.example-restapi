package com.ruberte.example.restapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ConfigurationProperties(prefix="restapi")
public class MailConfig {
	private String hostName; 
	private int port; 
	private String from;

	public String getHostName() {
		return hostName;
	}
	public int getPort() {
		return port;
	}
	public String getFrom() {
		return from;
	}
	@Override
	public String toString() {
		try {
			return (new ObjectMapper()).writeValueAsString(this);
		} catch (JsonProcessingException e) {
			return super.toString();
		} finally {}
	} 

}
