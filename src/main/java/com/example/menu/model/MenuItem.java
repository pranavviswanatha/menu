package com.example.menu.model;

import com.example.menu.enums.ItemType;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "menuitem", indexes = {@Index(name = "i1_menuitem", columnList = "itemtype")})
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

    @Enumerated(EnumType.STRING)
    @Column(name = "item_type")
    private ItemType itemType;


}
