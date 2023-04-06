package com.spring.movieticketbooking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.movieticketbooking.entity.Movie;
import com.spring.movieticketbooking.entity.Seat;
import com.spring.movieticketbooking.entity.Theatre;


public interface SeatRepository extends JpaRepository<Seat, Integer> {
	
	List<Seat> findByTheaterAndMovie(Theatre theater, Movie movie);

	

}
