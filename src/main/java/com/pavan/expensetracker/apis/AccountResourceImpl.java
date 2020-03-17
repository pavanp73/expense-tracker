package com.pavan.expensetracker.apis;

import com.pavan.expensetracker.model.dto.AccountDto;
import com.pavan.expensetracker.model.dto.AccountDtoRequest;
import com.pavan.expensetracker.service.AccountService;
import com.pavan.expensetracker.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("users/{userId}/accounts")
public class AccountResourceImpl implements AccountResource {

    private final AccountService accountService;

    @Autowired
    public AccountResourceImpl(AccountServiceImpl accountServiceImpl){
        this.accountService = accountServiceImpl;
    }

    @Override
    public String addAccount(@PathVariable("userId") String userId,
                             @RequestBody @Valid AccountDtoRequest accountDtoRequest) throws Exception {
        return accountService.addAccount(userId, accountDtoRequest);
    }

    @Override
    public List<AccountDto> getAllUserAccounts(@PathVariable("userId") String userId) throws Exception {
        return accountService.getAllUserAccounts(userId);
    }
}
