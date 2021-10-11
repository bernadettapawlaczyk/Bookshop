package com.example.bookshop.repository;

import com.example.bookshop.model.Book;
import com.example.bookshop.model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

    Optional<Review> findByBook(Book book);
}
