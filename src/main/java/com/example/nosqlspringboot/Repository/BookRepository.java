package com.example.nosqlspringboot.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public interface BookRepository extends MongoRepository<Book, Integer> {

}
