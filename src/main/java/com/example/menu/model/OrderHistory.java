package com.example.menu.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Map;
import java.util.Objects;

@Data
@Entity
@Table(name = "Order_History", indexes = {@Index(name = "i1_order_history", columnList = "customer_id")})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    @Column(name = "customer_id", nullable = false)
    private long customerId;

    @Column(name = "order_contents", nullable = false)
    private String orderContents;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "rating")
    private int rating; // Assuming the rating is from 1 to 5

}
