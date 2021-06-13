package com.gonzalo.barbershop.infrastructure.service;

import com.gonzalo.barbershop.application.repository.UserRepository;
import com.gonzalo.barbershop.application.service.UserService;
import com.gonzalo.barbershop.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public void createNewUser(final User user) {

    }

    @Override
    public void updateUser(final User user) {

    }

    @Override
    public void deleteUser(final User user) {

    }

    @Override
    public Boolean validateLogin(final User user) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return repository.getUserByEmail(email);
    }
}
