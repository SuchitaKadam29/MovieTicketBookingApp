package com.spring.movieticketbooking.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter   
@Data
@Entity
public class Booking {
	@Id
	@Column(name="booking_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bookingId;
	
	@Column(name="customer_id")
	String customerId;
	
	@ManyToOne
	@JoinColumn(name = "show_id")
	private Shows show;
	
	@Column(name="booking_date")
	Date bookingDate;
	
	@Min(100)@Max(1000)
	@Column(name="total_amount")
	Double totalAmount;
	
	@Column(name="payment_method")
	String paymentMethod;
	
	@Column(name="seat_no")
	int seatNo;

}