package com.spring.movieticketbooking.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.movieticketbooking.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findByTitleContaining(String title);

	List<Movie> findByGenre(String genre);

	List<Movie> findByReleaseDateBetween(LocalDate startDate);

}
