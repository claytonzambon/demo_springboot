package com.zambon.demo_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zambon.demo_springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
