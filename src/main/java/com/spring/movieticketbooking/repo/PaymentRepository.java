package com.spring.movieticketbooking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.movieticketbooking.entity.Booking;
import com.spring.movieticketbooking.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

	List<Payment> findByBooking(Booking booking);

}
