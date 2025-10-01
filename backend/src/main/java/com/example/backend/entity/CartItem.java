package com.example.backend.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CartItem {

    private Product product;

    private Integer quantity;
    
}
