package com.gonzalo.barbershop.application.repository;

import com.gonzalo.barbershop.domain.User;

public interface UserRepository {

    Boolean validateLogin(final User user);

    User getUserByEmail(String email);

    void updateUser(final User user);

    void createUser(final User user);
}
