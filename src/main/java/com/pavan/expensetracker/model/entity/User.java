package com.pavan.expensetracker.model.entity;

import com.pavan.expensetracker.annotations.NotNullOrBlank;
import com.pavan.expensetracker.model.BaseModel;
import com.pavan.expensetracker.utils.ValidationConstants;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class User extends BaseModel {

    @Column(length = 30, nullable = false, unique = true)
    @NotNullOrBlank(message = ValidationConstants.USER_NAME_NOT_BLANK)
    private String name;

    @OneToMany(mappedBy = "user")
    private Set<Account> accounts;
}
