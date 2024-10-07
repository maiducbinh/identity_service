package com.example.crud.mapper;

import com.example.crud.dto.request.UserCreationRequest;
import com.example.crud.dto.request.UserUpdateRequest;
import com.example.crud.dto.response.UserResponse;
import com.example.crud.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


//Error: @Mapper(componentModel = "spring")
@Mapper(componentModel = "spring")
public interface UserMapper {
    // input a usercreationrquest and output a user
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
