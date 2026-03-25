package com.ejemplo.bibliotecaduoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.bibliotecaduoc.model.Libro;
import com.ejemplo.bibliotecaduoc.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;


    public List<Libro> readAll(){
        return libroRepository.obtenerLibros();
    }


    public Libro create(Libro libro) {
       return libroRepository.guardarLibro(libro);

    }


}
