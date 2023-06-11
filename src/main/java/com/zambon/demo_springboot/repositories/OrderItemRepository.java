package com.zambon.demo_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zambon.demo_springboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
