package com.example.demo.repository;

import com.example.demo.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
    List<Expense> findByUserId(String userId);  // Custom query to find expenses by userId
}
