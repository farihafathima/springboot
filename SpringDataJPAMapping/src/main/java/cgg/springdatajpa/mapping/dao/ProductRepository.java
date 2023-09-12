package cgg.springdatajpa.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springdatajpa.mapping.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
