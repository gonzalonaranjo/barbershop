package com.gonzalo.barbershop.infrastructure.rest.service.controller;

import com.gonzalo.barbershop.application.service.UserService;
import com.gonzalo.barbershop.infrastructure.rest.service.dto.request.CreateUserRequestDto;
import com.gonzalo.barbershop.infrastructure.rest.service.dto.request.DeleteUserRequestDto;
import com.gonzalo.barbershop.infrastructure.rest.service.dto.request.UpdateUserRequestDto;
import com.gonzalo.barbershop.infrastructure.rest.service.dto.response.UserDto;
import com.gonzalo.barbershop.infrastructure.rest.service.mapper.UserDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserDtoMapper userMap;
    private final UserService service;

    @PostMapping(value = "/")
    @ResponseBody
    public ResponseEntity<HttpStatus> saveUser(@Valid @RequestBody CreateUserRequestDto user) {

        service.createNewUser(userMap.mapCreateUserRequestToDomain(user));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    /*@GetMapping(value = "/{email}")
    @ResponseBody
    public ResponseEntity<HttpStatus> checkEmail(@PathVariable String email) {

        return ResponseEntity.ok(HttpStatus.OK);
    }*/

    @PatchMapping(value = "/")
    @ResponseBody
    public ResponseEntity<HttpStatus> updateUser(@Valid @RequestBody UpdateUserRequestDto user) {

        service.updateUser(userMap.mapUpdateUserRequestToDomain(user));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/")
    @ResponseBody
    public ResponseEntity<HttpStatus> deleteUser(@RequestBody DeleteUserRequestDto user) {

        service.deleteUser(userMap.mapDeleteUserRequestToDomain(user));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{email}")
    @ResponseBody
    public ResponseEntity<UserDto> getUser(@PathVariable("email") String email) {
        return ResponseEntity.ok(
                userMap.mapUserToUserDto(service.getUserByEmail(email)));
    }

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<String> checkCredentials(@RequestBody String email, @RequestBody String password) {

        // valido o paso? no lo encontrará en BBDD

        service.validateCredentials(userMap.mapValidateUserRequestToDomain(email, password));
        // tenemos que generar el token

        return ResponseEntity.ok("TOKEN_GENERADO");
    }
}
