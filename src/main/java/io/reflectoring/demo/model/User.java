package io.reflectoring.demo.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
