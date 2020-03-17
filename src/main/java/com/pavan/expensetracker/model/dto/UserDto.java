package com.pavan.expensetracker.model.dto;

import com.pavan.expensetracker.annotations.NotNullOrBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private String id;

    @NotNullOrBlank(message = "Name cannot be blank")
    private String name;
}
