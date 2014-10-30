package com.isil.example.parseexample.model;

import java.io.Serializable;

/**
 * Created by emedinaa on 29/10/2014.
 */
public class UserEntity implements Serializable {
    private String username;
    private String lastname;
    private String dni;

    public UserEntity() {
    }

    public UserEntity(String username, String lastname, String dni) {
        this.username = username;
        this.lastname = lastname;
        this.dni = dni;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
