package com.example.springmysql.api.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import com.example.springmysql.api.dao.UserRepository;
import com.example.springmysql.api.model.MyUserDetails;
import com.example.springmysql.api.model.User;

@Service
public class MyUserDetailService  implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;

	public UserDetails loadUserByUsername(String userName)throws UsernameNotFoundException
	{
		Optional<User> user=userRepository.findByUserName(userName);
		user.orElseThrow(() -> new UsernameNotFoundException("Name is not found") + userName);
		
		return user.map(MyUserDetails::new).get();
	}
}
