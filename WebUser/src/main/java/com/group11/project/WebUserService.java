package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebUserService {
	@Autowired
	private WebUserRepo repo;

	public void saveWebUser(WebUser webUser) {
		repo.save(webUser);
	}
}