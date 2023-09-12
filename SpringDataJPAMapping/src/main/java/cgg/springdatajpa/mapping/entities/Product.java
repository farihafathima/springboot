package cgg.springdatajpa.mapping.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;


@Data
@Entity
public class Product {
	
	@Id
	private int productId;
	private String productName;
	@ManyToMany
	@JoinTable(name="pro_emp")
	private List<Category> categories=new ArrayList<>();
	

}
