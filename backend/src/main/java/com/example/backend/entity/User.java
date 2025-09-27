package com.example.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String role; // e.g., "USER", "ADMIN"

    //Setters & Getters

}
