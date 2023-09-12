package cgg.springdatajpa.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cgg.springdatajpa.mapping.dao.CategoryRepository;
import cgg.springdatajpa.mapping.dao.ProductRepository;
import cgg.springdatajpa.mapping.entities.Category;
import cgg.springdatajpa.mapping.entities.Product;

@SpringBootApplication
public class SpringDataJpaMappingApplication implements CommandLineRunner {
	private static final Logger logger=Logger.getLogger(SpringDataJpaMappingApplication.class.getName());
//	@Autowired
//	private QuestionRepository questionRepo;
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private CategoryRepository categoryRepo;
	
//	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMappingApplication.class, args);
	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		//creating the Question
//		
//		Question q1 = new Question();
//		q1.setQuestionId(1226);
//		q1.setQuestion("What is Java?");
//		
//		
//		
//		//creating Answer
//		//Answer1
//		
//		Answer a1 = new Answer();
//		a1.setAnswerId(1229);
//		a1.setAnswer("Java is a programming Language");
//		a1.setQuestion(q1);
//		
//		//Answer2
//		Answer a2 = new Answer();
//		a2.setAnswerId(1230);
//		a2.setAnswer("Java is a platform independent Language");
//		a2.setQuestion(q1);
//		
//		List<Answer> list = new ArrayList<>();
//		list.add(a1);
//		list.add(a2);
//		
//		q1.setAnswers(list);
//		
//		
//		
//		
//		
//		
//		
////		Question save = questionRepo.save(q1);
////		logger.info("Saved Question id is {}: " + save.getQuestionId());
//		
//		
//		//fetching data
//		Question question = questionRepo.findById(1226).get();
//		List<Answer> answers = question.getAnswers();
//		logger.info("the size is"+answers.size());
//		
//		
//		
//		
//		  
//		
//		  
//		  //fetching data
////		    Question question = questionRepo.findById(1226).get();
////		   logger.info("Question "+question.getQuestion()+" Answer : "+question.getAnswers());

	@Override
	public void run(String... args) throws Exception {
		//product 1
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setProductName("Santoor");
		
		
		//product 2
		
		Product p2 = new Product();
		p2.setProductId(2);
		p2.setProductName("Lux");
		
		//product 3
		Product p3 = new Product();
		p3.setProductId(3);
		p3.setProductName("Maggie");
		
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		
		//category 1
		Category c1 = new Category();
		c1.setCategoryId(11);
		c1.setCategoryName("Detergents");
		c1.setProducts(products);
		
		//Category 2
		Category c2 = new Category();
		c2.setCategoryId(12);
		c2.setCategoryName("Soaps");
		c2.setProducts(products);
		
		List<Category> categories = new ArrayList<Category>();
		categories.add(c1);
		categories.add(c2);
		p1.setCategories(categories);
		p2.setCategories(categories);
		
		Product prod1 = productRepo.save(p1);
		Product prod2 = productRepo.save(p2);
		
		Category cat1 = categoryRepo.save(c1);
		Category cat3 = categoryRepo.save(c2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
