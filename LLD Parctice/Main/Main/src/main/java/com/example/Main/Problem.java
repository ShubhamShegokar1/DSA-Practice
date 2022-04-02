package com.example.Main;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer problem_Id;
    Status status;
}
