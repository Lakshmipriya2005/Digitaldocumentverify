package com.example.digitaldocs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;
    @Column(name = "password", nullable = false)
    private String password;
}