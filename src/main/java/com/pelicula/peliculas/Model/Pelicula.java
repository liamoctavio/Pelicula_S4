package com.pelicula.peliculas.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {

    //Attributes  atributos: id, titulo, año, director, género y sinopsis

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name= "titulo")
    private String titulo;
    @Column(name= "anio")
    private int anio;
    @Column(name= "director")
    private String director;
    @Column(name= "genero")
    private String genero;
    @Column(name= "sinopsis")
    private String sinopsis;

    //Getters and setters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String name) {
        this.titulo = name;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int year) {
        this.anio = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genre) {
        this.genero = genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String synopsis) {
        this.sinopsis = synopsis;
    }

    



}
