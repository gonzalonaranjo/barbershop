package com.gonzalo.barbershop.infrastructure.rest.service.dto.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UpdateUserRequestDto {

    @NotEmpty
    private String name;

    @NotEmpty
    private String surName;

    @NotEmpty
    private String password;
}
