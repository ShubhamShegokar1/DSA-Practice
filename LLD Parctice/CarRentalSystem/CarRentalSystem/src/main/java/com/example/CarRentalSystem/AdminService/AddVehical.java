package com.example.CarRentalSystem.AdminService;

import com.example.CarRentalSystem.Entity.Vehical;

import static com.example.CarRentalSystem.CarRentalSystemApplication.vehicals;

public class AddVehical {


    void add(Vehical vehical){
          vehicals.add(vehical);
          System.out.println("Vehical Added Succesfully");
    }
}
