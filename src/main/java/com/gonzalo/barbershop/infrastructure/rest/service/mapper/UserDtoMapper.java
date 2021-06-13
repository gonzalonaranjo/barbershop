package com.gonzalo.barbershop.infrastructure.rest.service.mapper;

import com.gonzalo.barbershop.domain.User;
import com.gonzalo.barbershop.infrastructure.rest.service.dto.request.DeleteUserRequestDto;
import com.gonzalo.barbershop.infrastructure.rest.service.dto.request.UpdateUserRequestDto;
import com.gonzalo.barbershop.infrastructure.rest.service.dto.response.UserDto;
import com.gonzalo.barbershop.infrastructure.rest.service.dto.request.CreateUserRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

    User mapCreateUserRequestToDomain(CreateUserRequestDto source);

    User mapUpdateUserRequestToDomain(UpdateUserRequestDto source);

    User mapDeleteUserRequestToDomain(DeleteUserRequestDto source);

    User mapValidateUserRequestToDomain(String userName, String password);

    UserDto mapUserToUserDto(User fuente);
}
