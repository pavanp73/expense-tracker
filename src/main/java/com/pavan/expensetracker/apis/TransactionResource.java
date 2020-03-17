package com.pavan.expensetracker.apis;

import com.pavan.expensetracker.model.dto.TransactionDto;
import com.pavan.expensetracker.service.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionResource {

    private final TransactionServiceImpl transactionServiceImpl;

    @Autowired
    public TransactionResource(TransactionServiceImpl transactionServiceImpl){
        this.transactionServiceImpl = transactionServiceImpl;
    }

    @PostMapping
    public String addTransaction(
            @RequestBody @Valid TransactionDto transactionDto
    ) throws Exception {
        return transactionServiceImpl.addTransaction(transactionDto);
    }

    @GetMapping
    public List<TransactionDto> getAllTransactions(){
        return transactionServiceImpl.getAllTransactions();
    }
}