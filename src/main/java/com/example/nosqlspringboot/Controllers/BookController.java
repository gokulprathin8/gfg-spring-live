package com.example.nosqlspringboot.Controllers;

import java.util.List;
import com.example.nosqlspringboot.Models.Book;
import com.example.nosqlspringboot.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public List<java.awt.print.Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        Book book1 = new Book(book.getName(), book.getAuthorName(), book.getCost());
        bookRepository.save(book1);
        return book1;
    }

}
