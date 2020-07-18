package com.example.springmysql.api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmysql.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUserName(String userName);
}
