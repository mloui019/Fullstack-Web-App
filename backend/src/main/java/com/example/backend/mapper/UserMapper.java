package com.example.backend.mapper;

import com.example.backend.entity.User;
import com.example.backend.dto.UserRegistrationDTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    // Entity -> DTO
    UserRegistrationDTO toUserRegistrationDTO(User user);

    // DTO -> Entity
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "role", ignore = true)
    User fromRegistrationDTO(UserRegistrationDTO userRegistrationDTO);

}
