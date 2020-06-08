package com.er.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.er.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
