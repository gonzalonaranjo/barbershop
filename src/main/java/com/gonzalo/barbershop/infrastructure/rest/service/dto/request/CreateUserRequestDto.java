package com.gonzalo.barbershop.infrastructure.rest.service.dto.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class CreateUserRequestDto {

    @NotEmpty
    private String email;

    @NotEmpty
    private String name;

    private String surName;

    @NotEmpty
    private String password;
}
