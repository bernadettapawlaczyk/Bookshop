package com.example.bookshop.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityScan
@Data

public class Books {

    private long id;
    private long isbn;
    private String author;
    private String title;
    private Date releaseDate;



}
