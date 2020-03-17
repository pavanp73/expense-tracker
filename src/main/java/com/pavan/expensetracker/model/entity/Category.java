package com.pavan.expensetracker.model.entity;

import com.pavan.expensetracker.annotations.CheckCategoryType;
import com.pavan.expensetracker.annotations.NotNullOrBlank;
import com.pavan.expensetracker.model.BaseModel;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Data
public class Category extends BaseModel {

    @Column(length = 30, nullable = false, unique = true)
    @NotNullOrBlank(message = "Category name must not be blank")
    private String categoryName;

    @Column(length = 15, nullable = false)
    @NotNullOrBlank(message = "Category type must not be blank")
    @CheckCategoryType
    private String categoryType;

    @OneToMany(mappedBy = "category")
    private Set<Transaction> transactions;
}
