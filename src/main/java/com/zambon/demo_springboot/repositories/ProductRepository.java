package com.zambon.demo_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zambon.demo_springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
