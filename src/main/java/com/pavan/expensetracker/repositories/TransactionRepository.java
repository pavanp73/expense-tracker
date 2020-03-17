package com.pavan.expensetracker.repositories;

import com.pavan.expensetracker.model.entity.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends BaseRepository<Transaction> {
}
