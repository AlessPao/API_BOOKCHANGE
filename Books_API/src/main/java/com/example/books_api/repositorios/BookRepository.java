package com.example.books_api.repositorios;

import com.example.books_api.modelos.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}