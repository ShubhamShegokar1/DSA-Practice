package com.example.CarRentalSystem;

import com.example.CarRentalSystem.AdminService.AddVehical;
import com.example.CarRentalSystem.Entity.Address;
import com.example.CarRentalSystem.Entity.User;
import com.example.CarRentalSystem.Entity.Vehical;
import com.example.CarRentalSystem.UserService.RentVehical;
import com.example.CarRentalSystem.UserService.SearchVehical;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class CarRentalSystemApplication
{
	public static List<Vehical> vehicals = new ArrayList<>();
	public static List<User> users = new ArrayList<>();

	static {
		// added vehicals
		vehicals.add(new Vehical("Maruti",101,"MH-12 -VS-2903","Version : 6","Car",false,null,null));
		vehicals.add(new Vehical("Alto",102,"MH-12 -NS-2463","Version : 6","Car",false,null,null));
		vehicals.add(new Vehical("Lambo",103,"MH-12 -AU-4903","Version : 6","Car",false,null,null));
		vehicals.add(new Vehical("Bajaj",104,"MH-12 -ZH-9835","Version : 6","Two Wheeler",false,null,null));
		//Create One User
       users.add(new User("Jethalal Gada",new Address(444203,"Gokuldham Society",
			   "Film City","Mumbai","Maharstra","India"),"123456789012" ,324234,null));
	}

	public static void main(String[] args)
	{
		SpringApplication.run(CarRentalSystemApplication.class, args);

		// search on the basis of carName;
		SearchVehical.search("Alto");

		//booking vehical
		RentVehical.rent("Alto");

	}
}
