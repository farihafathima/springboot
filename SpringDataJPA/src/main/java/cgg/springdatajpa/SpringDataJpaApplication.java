package cgg.springdatajpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import cgg.springdatajpa.dao.UserRepository;
import cgg.springdatajpa.entites.User1;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		
		//Saving single onbjects
		/*
		 * User1 user = new User1(); user.setName("Fariha"); user.setCity("hyd");
		 * user.setStatus("I am a java programmer"); User1 user1=userRepo.save(user);
		 */
		
//		
//		User1 user1 = new User1();
//		user1.setName("Fariha");
//		user1.setCity("hyd");
//		 user1.setStatus("I am a java programmer");
//		 
//		 
//
//			User1 user2 = new User1();
//			user2.setName("Fariha");
//			user2.setCity("hyd");
//			 user2.setStatus("I am a java programmer");
//			 
//			 
//
//				User1 user3 = new User1();
//				user3.setName("Fariha");
//				user3.setCity("hyd");
//				 user3.setStatus("I am a java programmer");
//				 
//				 List<User1> users = List.of(user1,user2,user3);
//				 
//				 Iterable<User1> result = userRepo.saveAll(users);
//				 result.forEach(System.out::println);
		
		
		//update the user of id 3
//		Optional<User1> optional = userRepo.findById(3);
//		User1 user1 = optional.get();
//		user1.setCity("chennai");
//		User1 result = userRepo.save(user1);
//		System.out.println(result);
		
		//how to get the data
		//findbyId-returns optioanl containing your data
//		Iterable<User1> users = userRepo.findAll();
//		users.forEach(System.out::println);
		
		//deleting the user element
		
//		userRepo.deleteById(3);
//		System.out.println("deleted.....");
		
		
		
		
		//deleting all users
//		Iterable<User1> users = userRepo.findAll();
//		users.forEach(System.out::println);
//		userRepo.deleteAll(users);
		
		
//		List<User1> user = userRepo.findByName("Fariha");
//		user.forEach(System.out::println);
		
		
//		List<User1> user = userRepo.findByNameAndCity("Fariha","hyd");
//		user.forEach(System.out::println);
//		
//		System.out.println("-------------------------------------------");
//		
//		
//		List<User1> list = userRepo.findByStatusContaining("java");
//		list.forEach(System.out::println);
//		
//		List<User1> list1=userRepo.findByStatusLike("%a%");
		
		
//		List<User1> allUsers = userRepo.getAllUsers();
//		allUsers.forEach(System.out::println);
//		List<User1> list = userRepo.getUsersByName("Farisa","Chennai");
//		list.forEach(System.out::println);
		
//		List<User1> users = userRepo.getUsers();
//		users.forEach(System.out::println);
		
		
		List<User1> user = userRepo.getUsersByCity("Chennai");
		user.forEach(System.out::println);
	}

}
