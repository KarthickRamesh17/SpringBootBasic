package com.karthick.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthick.core.dao.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDAO doo;

	public PaymentDAO getDoo() {
		return doo;
	}

	public void setDoo(PaymentDAO doo) {
		this.doo = doo;
	}

}
