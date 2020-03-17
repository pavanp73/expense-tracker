package com.pavan.expensetracker.repositories;

import com.pavan.expensetracker.model.entity.Account;
import com.pavan.expensetracker.model.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends BaseRepository<Account>{

    List<Account> findByUser(User user);
}
