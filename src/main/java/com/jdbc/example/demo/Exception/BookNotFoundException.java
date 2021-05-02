package com.jdbc.example.demo.Exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(int id) {
        super("Book with id " + id + " is not found");
    }

}
