package com.pavan.expensetracker.service;

import com.pavan.expensetracker.model.dto.UserDto;
import com.pavan.expensetracker.model.entity.User;

import java.util.List;

public interface UserService {

    String addUser(UserDto userDto);

    List<UserDto> getAllUsers();

    User findById(String userId);
}
