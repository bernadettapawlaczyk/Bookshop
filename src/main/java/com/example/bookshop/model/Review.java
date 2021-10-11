package com.example.bookshop.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityScan
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String reviewText;

    @ManyToOne
    private Book book;
}
