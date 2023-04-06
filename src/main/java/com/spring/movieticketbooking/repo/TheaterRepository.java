package com.spring.movieticketbooking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.movieticketbooking.entity.Theatre;

public interface TheaterRepository extends JpaRepository<Theatre, Long> {

	List<Theatre> findByLocation(String location);

	List<Theatre> findByAmenities(String amenities);

	List<Theatre> findByMovieSelection(String movieTitle);

}
