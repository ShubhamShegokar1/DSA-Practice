package com.example.MovieTicketBookingSystem.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Movie {
    String name;
    String langauage;
    String genre;
    Date releaseDate;

}
