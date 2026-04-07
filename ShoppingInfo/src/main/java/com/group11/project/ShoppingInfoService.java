package com.group11.project;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShoppingInfoService {

	private RestTemplate restTemplate = new RestTemplate();

	public String getWebUserData(String loginId) {
		String webUserData = restTemplate.getForObject("http://localhost:8081/api/webuser/get/" + loginId,
				String.class);
		return webUserData;
	}
}