package com.pavan.expensetracker.apis;

import com.pavan.expensetracker.model.dto.AccountDto;
import com.pavan.expensetracker.model.dto.AccountDtoRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface AccountResource {

    @PostMapping
    String addAccount(@PathVariable("userId") String userID,
                      @RequestBody @Valid AccountDtoRequest accountDtoRequest) throws Exception;

    @GetMapping
    List<AccountDto> getAllUserAccounts(@PathVariable("userId") String userId) throws Exception;
}
