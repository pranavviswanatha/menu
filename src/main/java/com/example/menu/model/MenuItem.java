package com.example.menu.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "MenuItem")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    private String ingredients;

    @Column(name = "original_price", nullable = false)
    private double originalPrice;

    @Column(name = "current_price", nullable = false)
    private double currentPrice;

    @Column(name = "available", nullable = false)
    private boolean available = true;

    @Column(name = "wait")
    private int wait;

}
