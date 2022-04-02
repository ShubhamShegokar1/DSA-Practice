package com.example.Main;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Solution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer solution_Id;
    Integer problem_Id;
    Status status;
}
