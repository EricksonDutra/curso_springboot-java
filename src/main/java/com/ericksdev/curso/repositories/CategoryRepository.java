package com.ericksdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericksdev.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
