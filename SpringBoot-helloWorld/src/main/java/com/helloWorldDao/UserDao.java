package com.helloWorldDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helloWorldEntity.User;

public interface UserDao extends JpaRepository<User, Integer> {
}