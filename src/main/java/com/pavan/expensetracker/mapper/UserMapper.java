package com.pavan.expensetracker.mapper;

import com.pavan.expensetracker.model.dto.UserDto;
import com.pavan.expensetracker.model.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper extends AbstractMapper<User, UserDto> {

    @Override
    public UserDto buildDto(User user) {
        return UserDto.builder()
                .id(user.getId().toString())
                .name(user.getName()).build();
    }

    @Override
    public User buildEntity(UserDto userDto) {
        return User.builder()
                .name(userDto.getName()).build();
    }
}
