package com.example.bookshop.model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityScan
@Data
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String lastName;
    private String email;
    private String city;
    private String street;
    private long phoneNumber;

    @Enumerated CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;
}
