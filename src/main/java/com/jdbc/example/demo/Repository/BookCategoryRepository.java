package com.jdbc.example.demo.Repository;

import com.jdbc.example.demo.Models.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {



}
