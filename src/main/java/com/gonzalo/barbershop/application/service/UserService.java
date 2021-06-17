package com.gonzalo.barbershop.application.service;

import com.gonzalo.barbershop.domain.User;

public interface UserService {

    void createNewUser(final User user);

    void updateUser(final User user);

    void deleteUser(final User user);

    void validateCredentials(final User user);

    User getUserByEmail(String email);
}
