package com.ericksdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericksdev.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
