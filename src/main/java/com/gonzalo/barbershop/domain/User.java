package com.gonzalo.barbershop.domain;

import lombok.Data;

@Data
public class User {

    private String email;
    private String name;
    private String surName;
    private String password;
}
