package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learning.repostiory.PaymentRepository;

@SpringBootApplication
public class OrderServicesApplication implements CommandLineRunner{

	@Autowired
	private PaymentRepository orderRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OrderServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 //System.out.println(orderRepository.findByName("candy"));
	// System.out.println(orderRepository.findByTotalPriceLessThan(5000d));
		System.out.println(orderRepository.getAllPayment());
	}
}
