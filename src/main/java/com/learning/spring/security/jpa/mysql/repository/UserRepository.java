package com.learning.spring.security.jpa.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.spring.security.jpa.mysql.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
