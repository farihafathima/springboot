package cgg.springdatajpa.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springdatajpa.mapping.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
	

}
