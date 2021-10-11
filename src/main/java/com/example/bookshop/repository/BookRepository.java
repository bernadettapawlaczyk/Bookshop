package com.example.bookshop.repository;

import com.example.bookshop.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Optional<Book> findById (long id);
    Optional<Book> findByIsbn (long isbn);
    Optional<Book> findByAuthor (String author);
    Optional<Book> findByTitle (String title);
    Optional<Book> findByReleaseDate (Data releaseDate);
}
