package com.ericksdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericksdev.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
