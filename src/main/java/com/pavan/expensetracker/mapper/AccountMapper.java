package com.pavan.expensetracker.mapper;

import com.pavan.expensetracker.model.dto.AccountDto;
import com.pavan.expensetracker.model.dto.AccountDtoRequest;
import com.pavan.expensetracker.model.dto.AccountDtoResponse;
import com.pavan.expensetracker.model.entity.Account;
import com.pavan.expensetracker.model.enums.AccountType;
import org.springframework.stereotype.Service;

@Service
public class AccountMapper extends AbstractMapper<Account, AccountDto> {

    @Override
    public AccountDto buildDto(Account account) {
        return AccountDtoResponse.builder()
                .accountName(account.getAccountName())
                .accountType(account.getAccountType())
                .currentBalance(account.getCurrentBalance())
                .build();
    }

    @Override
    public Account buildEntity(AccountDto accountDto) {

        if(accountDto instanceof AccountDtoRequest){
            AccountDtoRequest accountDtoRequest = (AccountDtoRequest) accountDto;
            String accountType = accountDto.getAccountType();
            if(accountType.equalsIgnoreCase(AccountType.BANK.toString())){
                return getAccountObject(accountDtoRequest, AccountType.BANK.toString());
            } else if(accountType.equalsIgnoreCase(AccountType.CASH.toString())){
                return getAccountObject(accountDtoRequest, AccountType.CASH.toString());
            } else if(accountType.equalsIgnoreCase(AccountType.DEBIT_CARD.toString())){
                return getAccountObject(accountDtoRequest, AccountType.DEBIT_CARD.toString());
            } else {
                return getAccountObject(accountDtoRequest, AccountType.E_WALLET.toString());
            }
        }
        return null;
    }

    private Account getAccountObject(AccountDtoRequest accountDtoRequest, String accountType) {

        return Account.builder()
                .accountName(accountDtoRequest.getAccountName())
                .accountType(accountType)
                .initialBalance(accountDtoRequest.getInitialAmount())
                .currentBalance(accountDtoRequest.getInitialAmount())
                .build();
    }
}
