package com.example.MovieTicketBookingSystem.Entities;

public class User extends  Address {
    String name;
    String adharNo;
    Integer mobile;
    String Gender;

    public User(String cityName, String stateName,
                Integer pin, String country, String name, String adharNo, Integer mobile, String gender) {
        super(cityName, stateName, pin, country);
        this.name = name;
        this.adharNo = adharNo;
        this.mobile = mobile;
        Gender = gender;
    }
}
