package com.devSuperior.hrpayroll.servicies;

import org.springframework.stereotype.Service;

import com.devSuperior.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Michelle", 200.0, days);
	}
}
