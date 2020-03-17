package com.pavan.expensetracker.model.dto;

import com.pavan.expensetracker.annotations.NotNullOrBlank;
import lombok.*;

import javax.validation.constraints.PositiveOrZero;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDtoRequest extends AccountDto {

    @PositiveOrZero(message = "Initial amount cannot be negative")
    private double initialAmount;

    @Builder
    public AccountDtoRequest(String accountName, String accountType, double initialAmount){
        super(accountName, accountType);
        this.initialAmount = initialAmount;
    }
}
