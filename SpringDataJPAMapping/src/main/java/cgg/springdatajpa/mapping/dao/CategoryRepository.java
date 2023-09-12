package cgg.springdatajpa.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springdatajpa.mapping.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
