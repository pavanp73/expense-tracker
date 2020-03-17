package com.pavan.expensetracker.service;

import com.pavan.expensetracker.model.dto.AccountDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/{userId}/accounts")
public interface AccountService {

    @PostMapping
    String addAccount(String userId, AccountDto accountDto) throws Exception;

    @GetMapping
    List<AccountDto> getAllUserAccounts(String userId) throws Exception;
}
