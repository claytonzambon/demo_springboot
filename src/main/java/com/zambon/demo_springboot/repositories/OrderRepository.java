package com.zambon.demo_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zambon.demo_springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
