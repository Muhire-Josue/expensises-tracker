package com.tracka.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracka.app.model.Expense;

public interface ExpenseController extends JpaRepository<Expense, Long> {

}
