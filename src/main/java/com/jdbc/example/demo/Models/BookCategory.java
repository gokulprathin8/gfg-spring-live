package com.jdbc.example.demo.Models;

import javax.persistence.*;
import java.util.Iterator;
import java.util.Set;

@Entity
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    private Set<Book> books;

    public BookCategory() {
    }

    public BookCategory(String name) {
        this.name = name;
    }

    public BookCategory(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
        this.books.forEach(x -> x.setBookCategory(this));

//        Iterator it = books.iterator();
//        while(it.hasNext()) {
//            Book book = (Book) it.next();
//            book.setBookCategory(this);
//        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
