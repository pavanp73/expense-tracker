package com.pavan.expensetracker.model.dto;

import com.pavan.expensetracker.annotations.NotNullOrBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.PositiveOrZero;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

    @NotNullOrBlank(message = "Account name cannot be blank")
    private String accountName;

    @NotNullOrBlank(message = "Account type must not be blank")
    private String accountType;
}
