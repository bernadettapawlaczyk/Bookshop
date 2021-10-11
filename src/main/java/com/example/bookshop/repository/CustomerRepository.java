package com.example.bookshop.repository;

import com.example.bookshop.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long>{

    Optional<Customer> findById (long id);
    Optional<Customer> findByLastName (String lastName);
    Optional<Customer> findByEmail (String email);
    Optional<Customer> findByPhoneNumber (long phoneNumber);
}
