package com.tracka.app.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracka.app.model.Expense;
import com.tracka.app.repository.CategoryRepository;
import com.tracka.app.repository.ExpenseRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ExpenseController {

	
	@Autowired
	ExpenseRepository expenseRepository;
	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping("/expenses")
	public List<Expense> getExpenses(){
		return expenseRepository.findAll();
	}
	
	@GetMapping("/expense/{id}")
	public Optional<Expense> getExpense(@PathVariable long id) {
		return expenseRepository.findById(id);
	}
	
	@DeleteMapping("/expense/{id}")
	public ResponseEntity<Expense> deleteExpense(@PathVariable long id) {
		expenseRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
	@PostMapping("/expenses")
	ResponseEntity<Expense> createExpense(@RequestBody Expense expense) throws URISyntaxException{
		Expense result = expenseRepository.save(expense);
		return ResponseEntity.created(new URI("/expense" + result.getId())).body(result);
	}
}
