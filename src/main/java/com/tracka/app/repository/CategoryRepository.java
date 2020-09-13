package com.tracka.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracka.app.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findByName(String name);
}
