package com.example.bookshop.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityScan
@Data

public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private long isbn;
    private String author;
    private String title;
    private Date releaseDate;

    @OneToMany(mappedBy = "book")
    private List<Review> reviews;

}
