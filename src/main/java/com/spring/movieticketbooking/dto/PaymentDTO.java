package com.spring.movieticketbooking.dto;

import lombok.Data;

@Data
public class PaymentDTO {
	
		private Integer bookingId;
	    private double amount;
	    private String paymentMethod;


}
