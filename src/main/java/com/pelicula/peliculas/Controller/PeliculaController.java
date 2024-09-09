package com.pelicula.peliculas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pelicula.peliculas.Model.Pelicula;
import com.pelicula.peliculas.Service.PeliculaService;


import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/pelicula")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping
    public List<Pelicula> getAll() {
        return peliculaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Pelicula> getById(@PathVariable("id") Long id) {
        return peliculaService.getById(id);
    }

    @PostMapping
    public Pelicula save(@RequestBody Pelicula pelicula) {
        return peliculaService.save(pelicula);
    }
    

}
