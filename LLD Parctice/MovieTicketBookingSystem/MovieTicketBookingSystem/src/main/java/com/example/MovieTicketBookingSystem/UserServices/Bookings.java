package com.example.MovieTicketBookingSystem.UserServices;

import com.example.MovieTicketBookingSystem.Entities.Address;
import com.example.MovieTicketBookingSystem.Entities.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Bookings {
    public Movie movie;
    public  Address address;

}
