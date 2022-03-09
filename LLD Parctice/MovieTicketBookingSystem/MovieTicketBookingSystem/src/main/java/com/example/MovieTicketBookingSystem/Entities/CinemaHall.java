package com.example.MovieTicketBookingSystem.Entities;


import java.util.ArrayList;
import java.util.List;


public class CinemaHall extends  Address {
    String theatreName;

    List<Screen> screens;

    public CinemaHall(String cityName, String stateName, Integer pin, String country, String theatreName, List<Screen> screens) {
        super(cityName, stateName, pin, country);
        this.theatreName = theatreName;
        this.screens = screens;
    }
}
