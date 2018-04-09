package com.example.classexercise;

import java.util.ArrayList;

public class Organization {
    private String name;

    private ArrayList<Employee> theEmployees = new ArrayList<>();

    public void addEmployee(Employee employee){
        this.theEmployees.add(employee);
    }
    public Organization(){

    }
    public Organization (String name){
        this.name=name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
