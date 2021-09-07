package com.ericksdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericksdev.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
