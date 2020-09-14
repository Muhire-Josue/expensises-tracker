package com.tracka.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracka.app.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
