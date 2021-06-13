package com.gonzalo.barbershop.infrastructure.rest.service.dto.request;

import lombok.Data;

@Data
public class DeleteUserRequestDto {

    private String email;
    private String password;
}
