package com.ericksdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericksdev.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
