package com.gonzalo.barbershop.infrastructure.bbdd.repository;

import com.gonzalo.barbershop.infrastructure.bbdd.model.UserDbo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJpa extends CrudRepository<UserDbo, String> {
}
