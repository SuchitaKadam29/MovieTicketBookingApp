package com.spring.movieticketbooking.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Theatre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long theatreId;
	@Column(name = "theatre_name")
	private String theatreName;
	@Column
	private String location;
	@Column
	private String amenities;
}