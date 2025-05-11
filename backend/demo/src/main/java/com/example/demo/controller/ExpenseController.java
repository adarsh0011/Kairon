package com.example.demo.controller;

import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@CrossOrigin(origins = "*") // Allow frontend to access the API
public class ExpenseController {

    private final ExpenseRepository expenseRepo;

    public ExpenseController(ExpenseRepository expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    // Add new expense
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseRepo.save(expense);
    }

    // Get expenses by userId
    @GetMapping("/{userId}")
    public List<Expense> getUserExpenses(@PathVariable String userId) {
        return expenseRepo.findByUserId(userId);
    }

    // Delete an expense by ID
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable String id) {
        expenseRepo.deleteById(id);
    }
}
