package com.example.books_api.repositorios;

import com.example.books_api.modelos.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}