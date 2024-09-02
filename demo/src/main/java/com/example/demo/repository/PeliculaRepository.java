package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pelicula;


public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

    
}
