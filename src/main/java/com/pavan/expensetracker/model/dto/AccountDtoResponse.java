package com.pavan.expensetracker.model.dto;

import lombok.*;

import javax.validation.constraints.PositiveOrZero;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDtoResponse extends AccountDto{

    @PositiveOrZero(message = "Balance cannot be negative")
    private double currentBalance;

    @Builder
    public AccountDtoResponse(String accountName, String accountType, double currentBalance){
        super(accountName, accountType);
        this.currentBalance = currentBalance;
    }
}
