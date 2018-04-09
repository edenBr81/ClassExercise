package com.example.classexercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        Organization newOrganization;
        boolean form=false;
        Employee newemployee;

        ArrayList<Organization>organizations=new ArrayList<>();

        System.out.println("Enter Name of Organization");
        newOrganization=new Organization(keyboard.nextLine());
        System.out.println("Your Organization is called:" + newOrganization.getName());

        newemployee=new Employee();

        System.out.println("Enter Employee First Name:");
        newemployee.setEmployeeFirstName(keyboard.nextLine());

        System.out.println("Enter Employee Last Name:");
        newemployee.setEmployeeLastName(keyboard.nextLine());

        System.out.println("Enter Employee Number:");
        newemployee.setEmployeenumber(keyboard.nextLine());

        System.out.println("Your employee details:Employee First Name:"+newemployee.getEmployeeFirstName()+"Employee Last Name:"+newemployee.getEmployeeLastName()+"Employee Number:"+newemployee.getEmployeenumber());

           newOrganization.addEmployee(newemployee);

    }
}
