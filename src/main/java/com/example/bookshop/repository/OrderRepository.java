package com.example.bookshop.repository;

import com.example.bookshop.model.Order;
import com.example.bookshop.model.OrderStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository <Order, Long>{

    Optional<Order> findById (long id);
    Optional<Order> findByOrderStatus (OrderStatus orderStatus);
    Optional<Order> findByDeliveryDate (LocalDate deliveryDate);
    Optional<Order> findByReturnDate (LocalDate returnDate);
}
