package com.example.CarRentalSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Vehical {
    public String VehicalName;
    Integer stallNumber;
    public  String vehicalNumber;
    String Model;
    String vehicalType;
    public boolean occupied;
    Date bookingDate;
    Date returnDate;
    @Override
    public String toString() {
        return  "Vehical Name='" + VehicalName + '\'' +
                ", Stall Number=" + stallNumber +
                ", Vehical Number='" + vehicalNumber + '\'' +
                ", Model='" + Model + '\'' +
                ", Vehical Type= " + vehicalType + '\'' +
                '}';
    }
}
