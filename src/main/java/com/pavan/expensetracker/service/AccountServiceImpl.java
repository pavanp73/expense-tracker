package com.pavan.expensetracker.service;

import com.pavan.expensetracker.mapper.AccountMapper;
import com.pavan.expensetracker.model.dto.AccountDto;
import com.pavan.expensetracker.model.dto.UserDto;
import com.pavan.expensetracker.model.entity.Account;
import com.pavan.expensetracker.model.entity.User;
import com.pavan.expensetracker.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    private final UserService userService;

    private final AccountRepository accountRepository;

    private final AccountMapper accountMapper;

    @Autowired
    public AccountServiceImpl(UserServiceImpl userServiceImpl, AccountMapper accountMapper, AccountRepository accountRepository){
        this.userService = userServiceImpl;
        this.accountMapper = accountMapper;
        this.accountRepository = accountRepository;
    }

    @Override
    public String addAccount(String userId, AccountDto accountDto) throws Exception {
        User user = userService.findById(userId);
        if(user == null){
            throw new Exception("User Id " + userId + " not found");
        }
        Account account = accountMapper.buildEntity(accountDto);
        account.setUser(user);
        return accountRepository.save(account).getId().toString();
    }

    @Override
    public List<AccountDto> getAllUserAccounts(String userId) throws Exception{
        User user = userService.findById(userId);
        if(user == null){
            throw new Exception("User Id " + userId + " not found");
        }
        List<Account> accounts = accountRepository.findByUser(user);
        return accountMapper.buildListDto(accounts);
    }
}
