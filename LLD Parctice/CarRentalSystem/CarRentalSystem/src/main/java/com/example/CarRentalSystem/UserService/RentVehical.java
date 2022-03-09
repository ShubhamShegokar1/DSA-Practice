package com.example.CarRentalSystem.UserService;

import com.example.CarRentalSystem.Entity.Vehical;

import java.util.Calendar;
import java.util.Date;

import static com.example.CarRentalSystem.CarRentalSystemApplication.vehicals;

public class RentVehical {

   public static void rent(String name)
   {
       Calendar cal = Calendar.getInstance();

       for(Vehical i:vehicals)
       {
           if(i.VehicalName==name && i.occupied==false)
           {
               i.setOccupied(true);
               i.setBookingDate(new Date());
              // i.setReturnDate( new Date()+ 3) );
               System.out.println("Booking Confirm");
               break;
           }
       }
   }

}
