package com.jdbc.example.demo.Controller;

import com.jdbc.example.demo.Exception.BookNotFoundException;
import com.jdbc.example.demo.Models.Book;
import com.jdbc.example.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

}
