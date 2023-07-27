package com.mphasis.storeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mphasis.domain.Product;
import com.mphasis.repository.ProductRepository;

@SpringBootApplication
public class StoreappApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("productRepository")
	//not recommended in production environment but can be used in developer stage
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);/*1*/
	}
//after the execution of the main method in 1, then in calls the code in 2 run method
	@Override
	public void /*2*/run(String... args) throws Exception {
// first value of integer is null that y hiberate recommends to keeps id as  a wraper class
		 productRepository.save(new Product(null,"tv","lg","4324.9"));
		 productRepository.save(new Product(null,"tv","lg","4324.9"));
		 productRepository.save(new Product(null,"earbud2","samsung","3224.9"));
		 productRepository.save(new Product(null,"tv","oneplus","4324.9"));
	}

}
