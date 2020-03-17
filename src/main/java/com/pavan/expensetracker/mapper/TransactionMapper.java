package com.pavan.expensetracker.mapper;

import com.pavan.expensetracker.model.dto.TransactionDto;
import com.pavan.expensetracker.model.entity.Transaction;
import com.pavan.expensetracker.utils.DateUtils;
import org.springframework.stereotype.Service;

@Service
public class TransactionMapper extends AbstractMapper<Transaction, TransactionDto> {

    @Override
    public TransactionDto buildDto(Transaction transaction) {
        return TransactionDto.builder()
                .amount(transaction.getAmount())
                .category(transaction.getCategory().getCategoryName())
                .transactionDate(DateUtils.toString(transaction.getTransactionDate()))
                .description(transaction.getDescription())
                .build();
    }

    @Override
    public Transaction buildEntity(TransactionDto transactionDto) {
        return Transaction.builder()
                .build();
    }
}
