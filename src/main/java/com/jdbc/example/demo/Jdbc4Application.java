package com.jdbc.example.demo;

import com.jdbc.example.demo.Models.Book;
import com.jdbc.example.demo.Models.BookCategory;
import com.jdbc.example.demo.Repository.BookCategoryRepository;
import com.jdbc.example.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

@SpringBootApplication
public class Jdbc4Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Jdbc4Application.class, args);
    }


    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookCategoryRepository bookCategoryRepository;

    @Override
    public void run(String... args) throws Exception {

//        Set<Book> bookSet = new HashSet<>();
//
//        Book b1 = new Book( "test", "test", 0, 1);
//        Book b2 = new Book("test", "test", 0, 1);
//
////        books.add(b1);
////        books.add(b2);
//
//        bookRepository.saveAll(bookSet);
//
//        bookCategoryRepository.save(new BookCategory("Programming"));
//        bookCategoryRepository.save(new BookCategory("Programming Langs", bookSet));

//        System.out.println(bookRepository.findAuthorName("test"));


        Set<Book> books = new HashSet<>();
//        Book b1 = new Book("HTML", "BOB", 200);
        Book b2 = new Book("CSS", "Lee", 40, 3);

//        books.add(b1);
        books.add(b2);

        bookRepository.save(b2);
//        bookRepository.saveAll(books);

//        bookCategoryRepository.save(new BookCategory("Non Programming Languages"));
//        bookCategoryRepository.save(new BookCategory("Programming Languages", books));


    }
}
