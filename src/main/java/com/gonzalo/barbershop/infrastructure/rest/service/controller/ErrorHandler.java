package com.gonzalo.barbershop.infrastructure.rest.service.controller;

import com.gonzalo.barbershop.domain.error.NotFoundException;
import com.gonzalo.barbershop.infrastructure.rest.service.dto.ErrorDto;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<Object> notFound(Exception e) {

        return new ResponseEntity<>(new ErrorDto(HttpStatus.NOT_FOUND.value(), e.getMessage()), HttpStatus.NOT_FOUND);
    }
}
