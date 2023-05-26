package com.learning.repostiory;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.learning.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long>{
	
	List<PaymentEntity> findByName(String name);
	List<PaymentEntity> findByDate(LocalDate localDate);
	List<PaymentEntity> findByTotalPriceLessThan(Double totalPrice);
	
	@Query("select entity from PaymentEntity entity")//JPQL(Java Persistence Query Language)
	List<PaymentEntity> getAllPayment();
}
