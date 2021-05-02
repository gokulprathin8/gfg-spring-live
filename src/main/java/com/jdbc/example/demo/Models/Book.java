package com.jdbc.example.demo.Models;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "book_name")
    private String name;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "price")
    private int cost;

    @ManyToOne
    @JoinColumn
    private BookCategory bookCategory;

    public Book() {
    }

    public Book(String name, String authorName, int cost) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

    public Book(String name, String authorName, int cost, BookCategory bookCategory) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
        this.bookCategory = bookCategory;
    }

    public Book(int id, String name, String authorName, int cost) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Book(String name, String authorName, int cost, int bookCategory) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
        this.bookCategory = new BookCategory();
        this.bookCategory.setId(bookCategory);
    }


}
