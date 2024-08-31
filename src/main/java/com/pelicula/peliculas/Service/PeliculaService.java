package com.pelicula.peliculas.Service;

import com.pelicula.peliculas.Model.Pelicula;
import java.util.List;
import java.util.Optional;

public interface PeliculaService {

    
    List<Pelicula> getAll();
    Optional<Pelicula> getById(Long id);


}
