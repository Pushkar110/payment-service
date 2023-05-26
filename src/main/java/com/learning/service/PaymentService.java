package com.learning.service;

import com.learning.entity.PaymentEntity;
import com.learning.enums.Status;

public interface PaymentService {

	Long create(PaymentEntity orderEntity);
	PaymentEntity findById(Long id);
	Status updateById(Long id, PaymentEntity orderEntity);
	Status deleteById(Long id);
}
