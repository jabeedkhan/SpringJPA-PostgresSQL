package com.springjpa;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringJpaPostgresSqlApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringJpaPostgresSqlApplication.class, args);
//	}
//
//}



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjpa.repo.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringJpaPostgresSqlApplication implements CommandLineRunner{
	
	@Autowired
	CustomerRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPostgresSqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.deleteAll();
		
	}

}

