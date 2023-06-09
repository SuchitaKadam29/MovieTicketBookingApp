package com.spring.movieticketbooking.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.movieticketbooking.entity.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

	@Query("SELECT m FROM Movies m WHERE LOWER(m.genre) like %:key% OR LOWER(m.movieTitle) like %:key%")
	public List<Movie> searchMoviesByKeyword(@Param("key") String keyword);

}
