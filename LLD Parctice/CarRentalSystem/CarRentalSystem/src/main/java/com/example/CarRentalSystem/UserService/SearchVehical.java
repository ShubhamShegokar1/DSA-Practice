package com.example.CarRentalSystem.UserService;

import com.example.CarRentalSystem.Entity.Vehical;
import static com.example.CarRentalSystem.CarRentalSystemApplication.vehicals;

public class SearchVehical {

    public static void search(String vehicalName)
    {
        boolean b=false;
        for(Vehical i:vehicals)
        {
          if(i.VehicalName==vehicalName && i.occupied==false){
              b=true;
              System.out.println(i);
          }
        }
        if(b==false){
            System.out.println("NO Vehicals Available");
        }
    }
}
