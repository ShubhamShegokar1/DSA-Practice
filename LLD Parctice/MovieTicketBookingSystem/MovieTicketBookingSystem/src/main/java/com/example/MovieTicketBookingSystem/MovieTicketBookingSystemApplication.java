package com.example.MovieTicketBookingSystem;

import com.example.MovieTicketBookingSystem.Entities.*;
import com.example.MovieTicketBookingSystem.UserServices.UerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MovieTicketBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketBookingSystemApplication.class, args);

		UerService uerService= new UerService();


		Movie movie = new Movie("Shershah", "Hindi","Action",new Date());

        Screen screen1= new Screen(101);
		Screen screen2= new Screen(102);
		Screen screen3= new Screen(103);

		List<Screen> listOfScreen = new ArrayList<>();
		listOfScreen.add(screen1);
		listOfScreen.add(screen2);
		listOfScreen.add(screen3);

		Address address= new CinemaHall("Pune","Maharashtra",
				413983,"India","BigCinema",listOfScreen);

		uerService.addMovie(address,movie);


		System.out.println(UerService.BookingList);

	}

}
