package com.spring.movieticketbooking.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.movieticketbooking.entity.Booking;
import com.spring.movieticketbooking.entity.Movie;
import com.spring.movieticketbooking.entity.Theatre;
import com.spring.movieticketbooking.entity.User;

public interface BookingRepository extends JpaRepository<Booking, Long> {

	List<Booking> findByUser(User user);

	List<Booking> findByTheaterAndMovieAndBookingDate(Theatre theater, Movie movie, LocalDate bookingDate);

}
