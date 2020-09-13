package com.tracka.app.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "expenses")
public class Expense {

	
	private long id;
	private String description;
	private Instant expenseDate;
	
	
	@ManyToOne
	private Category category;
	@ManyToOne
	private User user;
}
