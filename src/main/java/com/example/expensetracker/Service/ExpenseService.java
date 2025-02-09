package com.example.expensetracker.Service;

import com.example.expensetracker.Repository.ExpenseRepository;
import com.example.expensetracker.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService{

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public void saveExpense(Expense expense){
        expenseRepository.save(expense);
    }

    public Expense getExpenseById(long id){
        return expenseRepository.findById(id)
                .orElse(null);
    }

    public void deleteExpenseById(long id){
        expenseRepository.deleteById(id);
    }
}
