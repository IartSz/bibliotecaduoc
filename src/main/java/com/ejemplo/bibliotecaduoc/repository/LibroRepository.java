package com.ejemplo.bibliotecaduoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejemplo.bibliotecaduoc.model.Libro;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros(){
        return listaLibros;
    }

    public Libro guardarLibro(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }
}
