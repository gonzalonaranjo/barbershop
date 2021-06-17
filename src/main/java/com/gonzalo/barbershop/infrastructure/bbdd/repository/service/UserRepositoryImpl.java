package com.gonzalo.barbershop.infrastructure.bbdd.repository.service;

import com.gonzalo.barbershop.application.repository.UserRepository;
import com.gonzalo.barbershop.domain.User;
import com.gonzalo.barbershop.domain.error.NotFoundException;
import com.gonzalo.barbershop.infrastructure.bbdd.mapper.UserMapper;
import com.gonzalo.barbershop.infrastructure.bbdd.repository.UserRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserRepositoryJpa repository;
    private final UserMapper map;

    @Override
    public Boolean validateLogin(User user) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {

        var maybeUser = repository.findById(email);

        return maybeUser.map(map::mapUserDboToDomain).orElseThrow(() -> new NotFoundException("User not found"));
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void createUser(User user) {

    }
}
