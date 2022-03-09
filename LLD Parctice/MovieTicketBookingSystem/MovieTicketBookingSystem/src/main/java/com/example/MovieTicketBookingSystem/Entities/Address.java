package com.example.MovieTicketBookingSystem.Entities;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public abstract class Address {
    String cityName;
    String stateName;
    Integer pin;
    String country;

}
