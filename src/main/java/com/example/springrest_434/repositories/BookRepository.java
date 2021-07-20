package com.example.springrest_434.repositories;

import com.example.springrest_434.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository <Book, Long> {

    // custom query to search to blog post by title or content

    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);

}
