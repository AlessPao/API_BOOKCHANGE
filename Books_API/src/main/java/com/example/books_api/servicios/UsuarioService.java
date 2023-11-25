package com.example.books_api.servicios;

import com.example.books_api.modelos.Usuario;
import com.example.books_api.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public void registrar(Usuario usuario) {
        repo.save(usuario);
    }
}