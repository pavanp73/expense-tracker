package com.pavan.expensetracker.apis;

import com.pavan.expensetracker.model.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface UserResource {

    @PostMapping
    String addUser(@RequestBody @Valid UserDto userDto);

    @GetMapping
    List<UserDto> getAllUsers();
}
