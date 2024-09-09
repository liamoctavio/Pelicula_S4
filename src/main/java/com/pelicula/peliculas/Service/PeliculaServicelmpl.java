package com.pelicula.peliculas.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pelicula.peliculas.Model.Pelicula;
import com.pelicula.peliculas.Repository.PeliculaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServicelmpl implements PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAll() {
        return peliculaRepository.findAll();
    }

    @Override
    public Optional<Pelicula> getById(Long id) {
        return peliculaRepository.findById(id);
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }


}
