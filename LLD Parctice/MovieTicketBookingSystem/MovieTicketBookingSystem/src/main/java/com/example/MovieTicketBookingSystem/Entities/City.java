package com.example.MovieTicketBookingSystem.Entities;

import java.util.ArrayList;
import java.util.List;

public class City extends Address{

    public City(String cityName, String stateName, Integer pin, String country, List<CinemaHall> cinemaHall) {
        super(cityName, stateName, pin, country);
        this.cinemaHall = cinemaHall;
    }

    List<CinemaHall> cinemaHall = new ArrayList<>();


}
