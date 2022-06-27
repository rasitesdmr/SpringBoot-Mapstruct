package com.example.springbootmapstruct.mapper;

import com.example.springbootmapstruct.dto.UserDTO;
import com.example.springbootmapstruct.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);

    List<UserDTO> userToUserDTO(List<User> userDTOToUser);


}