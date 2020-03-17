package com.pavan.expensetracker.apis;

import com.pavan.expensetracker.model.dto.UserDto;
import com.pavan.expensetracker.service.UserService;
import com.pavan.expensetracker.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResourceImpl implements UserResource{

    private UserService userService;

    @Autowired
    public UserResourceImpl(UserServiceImpl userServiceImpl){
        this.userService = userServiceImpl;
    }

    @Override
    public String addUser(
            @RequestBody @Valid UserDto userDto){
        return userService.addUser(userDto);
    }

    @Override
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }
}
