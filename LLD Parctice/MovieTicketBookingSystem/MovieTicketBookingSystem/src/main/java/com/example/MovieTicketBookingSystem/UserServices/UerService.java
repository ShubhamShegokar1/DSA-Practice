package com.example.MovieTicketBookingSystem.UserServices;

import com.example.MovieTicketBookingSystem.Entities.Address;
import com.example.MovieTicketBookingSystem.Entities.Movie;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class UerService
{
    public static  List<Bookings> BookingList= new ArrayList<>();
    public void addMovie(Address address, Movie movie)
    {
        Bookings bookings= new Bookings(movie,address);
        BookingList.add(bookings);
    }
}
