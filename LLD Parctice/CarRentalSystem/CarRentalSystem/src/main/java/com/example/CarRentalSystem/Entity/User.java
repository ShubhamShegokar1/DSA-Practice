package com.example.CarRentalSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
    String Name;
    Address address;
    String adharNo;
    Integer Mobile;
    Vehical vehical;
}
