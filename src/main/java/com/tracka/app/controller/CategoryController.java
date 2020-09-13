package com.tracka.app.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracka.app.model.Category;
import com.tracka.app.repository.CategoryRepository;

@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;

	@GetMapping("/category")
	public Collection<Category> categories() {
		return categoryRepository.findAll();
	}

	@GetMapping("/category/{id}")
	public ResponseEntity<?> getCategory(@PathVariable long id) {
		Optional<Category> category = categoryRepository.findById(id);

		return category.map(response -> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
