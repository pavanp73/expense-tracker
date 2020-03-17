package com.pavan.expensetracker.repositories;

import com.pavan.expensetracker.model.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends BaseRepository<Category> {
}
