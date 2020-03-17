package com.pavan.expensetracker.service;

import com.pavan.expensetracker.mapper.Mapper;
import com.pavan.expensetracker.mapper.TransactionMapper;
import com.pavan.expensetracker.model.dto.TransactionDto;
import com.pavan.expensetracker.model.entity.Category;
import com.pavan.expensetracker.model.entity.Transaction;
import com.pavan.expensetracker.model.enums.CategoryType;
import com.pavan.expensetracker.repositories.TransactionRepository;
import com.pavan.expensetracker.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Override
    public String addTransaction(TransactionDto transactionDto) throws Exception {
        return null;
    }

    @Override
    public List<TransactionDto> getAllTransactions() {
        return null;
    }
}
