package com.pavan.expensetracker.model.entity;

import com.pavan.expensetracker.annotations.CheckCategoryType;
import com.pavan.expensetracker.annotations.CheckTransactionType;
import com.pavan.expensetracker.model.BaseModel;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class Transaction extends BaseModel {

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date transactionDate;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(length = 100)
    private String description;

    @Column(length = 20, nullable = false)
    @CheckTransactionType
    private String transactionType;
}
