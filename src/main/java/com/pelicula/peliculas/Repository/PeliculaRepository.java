package com.pelicula.peliculas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pelicula.peliculas.Model.Pelicula;


    public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
        
    }



