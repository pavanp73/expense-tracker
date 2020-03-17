package com.pavan.expensetracker.service;

import com.pavan.expensetracker.model.dto.TransactionDto;

import java.util.List;

public interface TransactionService {

    String addTransaction(TransactionDto transactionDto) throws Exception;

    List<TransactionDto> getAllTransactions();
}
