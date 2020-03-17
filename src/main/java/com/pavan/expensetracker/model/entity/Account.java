package com.pavan.expensetracker.model.entity;

import com.pavan.expensetracker.annotations.CheckAccountType;
import com.pavan.expensetracker.annotations.NotNullOrBlank;
import com.pavan.expensetracker.model.BaseModel;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.PositiveOrZero;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Account extends BaseModel {

    @Column(length = 30, nullable = false)
    @NotNullOrBlank(message = "Account name cannot be empty")
    private String accountName;

    @Column(length = 20, nullable = false)
    @NotNullOrBlank(message = "Account type cannot be empty")
    @CheckAccountType
    private String accountType;

    @Column(nullable = false)
    @PositiveOrZero(message = "Initial balance must not be negative")
    private double initialBalance;

    @Column(nullable = false)
    @PositiveOrZero(message = "Balance cannot be negative")
    private double currentBalance;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
