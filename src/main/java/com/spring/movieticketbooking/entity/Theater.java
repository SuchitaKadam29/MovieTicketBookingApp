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
public class Theater {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="theatre_id")
	 int theatreId;
	 @Column(name="theatre_name")
	 String theatreName;
	 @Column(name="location")
	 String location;
	 @Column(name="seating_capacity")
	 int seatingCapacity;
	 @Column(name="ticket_price")
	 double ticketPrice;
   

}