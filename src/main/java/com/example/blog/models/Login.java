package com.example.blog.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Login {
    @Id
    private long id;

    private String email;

    private String password;
}
