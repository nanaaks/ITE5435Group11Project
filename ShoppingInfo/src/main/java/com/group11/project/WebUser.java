package com.group11.project;

import jakarta.persistence.*;

@Entity
@Table(name = "web_user")
public class WebUser {
	@Id
	private String loginId;
	private String password;

	@Enumerated(EnumType.STRING)
	private UserState state;

	
	public WebUser() {
	}

	
	public WebUser(String loginId, String password, UserState state) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.state = state;
	}


	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserState getState() {
		return state;
	}

	public void setState(UserState state) {
		this.state = state;
	}
}
