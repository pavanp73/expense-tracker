package com.pavan.expensetracker.model.enums;

public enum CategoryType {

    EXPENSE("Expense"),
    INCOME("Income"),
    TRANSFER("Transfer");

    private String value;

    CategoryType(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
