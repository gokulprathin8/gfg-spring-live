package com.jdbc.example.demo.Repository;

import java.util.List;
import com.jdbc.example.demo.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "select * from Book b where b.author_name=:my_name", nativeQuery = true)
    public List<Book> findAuthorName(String my_name);

}
