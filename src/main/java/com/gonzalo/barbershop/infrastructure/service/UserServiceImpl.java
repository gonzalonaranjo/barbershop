package com.gonzalo.barbershop.infrastructure.service;

import com.gonzalo.barbershop.application.repository.UserRepository;
import com.gonzalo.barbershop.application.service.UserService;
import com.gonzalo.barbershop.domain.User;
import com.gonzalo.barbershop.domain.error.NotAuthorizatedException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public void createNewUser(final User user) {
        repository.createUser(user);
    }

    @Override
    public void updateUser(final User user) {
        var userFound = getUserByEmail(user.getEmail());
        userFound.setName(user.getName());
        userFound.setPassword(user.getPassword());
        userFound.setSurName(user.getPassword());

        repository.updateUser(user);
    }

    @Override
    public void deleteUser(final User user) {

    }

    @Override
    public void validateCredentials(final User user) {

        var userFound = getUserByEmail(user.getEmail());

        if (!userFound.getPassword().equals(user.getPassword())) {
            throw new NotAuthorizatedException("Incorrect password");
        }
    }

    @Override
    public User getUserByEmail(String email) {
        return repository.getUserByEmail(email);
    }
}
