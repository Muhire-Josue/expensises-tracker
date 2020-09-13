package com.tracka.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name = "categories")
public class Category {

	
	@Id
	private long id;
	private String name;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private User user;
}
