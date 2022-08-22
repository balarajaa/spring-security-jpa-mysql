package com.learning.spring.security.jpa.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.spring.security.jpa.mysql.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
