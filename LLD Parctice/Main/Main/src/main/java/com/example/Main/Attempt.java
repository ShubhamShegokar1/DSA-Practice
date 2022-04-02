package com.example.Main;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attempt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer attempt_Id;

    Integer user_Id;
    Status status;
}
