package com.itjason.mall.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommonClient{
	private RestTemplate restTemplate = new RestTemplate();
	
	private String restUrl;
	
	public String getRestUrl() {
		return restUrl;
	}

	public void setRestUrl(String restUrl) {
		this.restUrl = restUrl;
	}

	public String getData(){
		return restTemplate.getForObject(this.restUrl, String.class);
	}
}
