package com.yyw.test.domain;

import java.util.Date;

public class User {
	private Integer userId;
	private String username;
	private String password;
	private Date loginTime;

	public Integer getId() {
		return userId;
	}

	public void setId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", username=" + username + ", password=" + password + ", loginTime=" + loginTime
				+ "]";
	}
  
}
