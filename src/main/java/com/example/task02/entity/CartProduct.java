package com.example.task02.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Sanjarbek Allayev, вс 12:20. 13.03.2022
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CartProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Product product;

    @Column(nullable = false)
    private Integer amount;

    @ManyToOne
    private Cart cart;
}
