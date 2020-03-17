package com.pavan.expensetracker.model.enums;

public enum AccountType {

    BANK("Bank"),
    CASH("Cash"),
    DEBIT_CARD("Debit Card"),
    E_WALLET("eWallet");

    private String value;

    AccountType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
