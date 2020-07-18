package com.example.springmysql.api.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.userdetails.*;

public class MyUserDetails implements UserDetails{

	private String username;
	private String password;
	private boolean active;
	private List<GrantedAuthority> authorities;
	
	

	public MyUserDetails(User user)
	{
		this.username =user.getUsername();
		this.password = user.getPassword();
		this.active=user.isActive();
		this.authorities= Arrays.stream( user.getRoles().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
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


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public void setAuthorities(List<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	
}
