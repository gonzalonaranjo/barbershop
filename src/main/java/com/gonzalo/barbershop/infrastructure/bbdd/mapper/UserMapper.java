package com.gonzalo.barbershop.infrastructure.bbdd.mapper;

import com.gonzalo.barbershop.domain.User;
import com.gonzalo.barbershop.infrastructure.bbdd.model.UserDbo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User mapUserDboToDomain(UserDbo source);
}
