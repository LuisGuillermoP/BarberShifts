package com.shifts.barber_app.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rol(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Rol(String name) {
        this.name = name;
    }

    public Rol() {
    }
}
