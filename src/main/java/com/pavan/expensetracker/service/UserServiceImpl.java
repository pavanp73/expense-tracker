package com.pavan.expensetracker.service;

import com.pavan.expensetracker.mapper.UserMapper;
import com.pavan.expensetracker.model.dto.UserDto;
import com.pavan.expensetracker.model.entity.User;
import com.pavan.expensetracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository){
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public String addUser(UserDto userDto) {
        return userRepository.save(
                userMapper.buildEntity(userDto)
        ).getId().toString();
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        if(users == null){
            return new ArrayList<>();
        }
        return userMapper.buildListDto(users);
    }

    @Override
    public User findById(String userId) {
        Optional<User> optionalUser = userRepository.findById(UUID.fromString(userId));
        return optionalUser.orElse(null);
    }
}
