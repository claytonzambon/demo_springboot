package com.zambon.demo_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zambon.demo_springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
