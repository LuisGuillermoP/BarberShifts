package com.shifts.barber_app.DTO;

import com.shifts.barber_app.model.Rol;

import java.util.Collection;


public class UserRegisterDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private Collection<Rol> rol;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Rol> getRol() {
        return rol;
    }

    public void setRol(Collection<Rol> rol) {
        this.rol = rol;
    }
    public UserRegisterDTO(Long id, String nombre, String apellido, String email, String password, Collection<Rol> rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public UserRegisterDTO(String nombre, String apellido, String email, String password, Collection<Rol> rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public UserRegisterDTO(String email) {
        this.email = email;
    }

    public UserRegisterDTO() {
    }
}
