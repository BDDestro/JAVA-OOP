/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2020, 15000.5);

        // Display initial car details
        System.out.println("Company Name: " + myCar.getCompanyName());
        System.out.println("Model Name: " + myCar.getModelName());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage() + " miles");

        // Modify car details
        myCar.setCompanyName("Honda");
        myCar.setModelName("Accord");
        myCar.setYear(2021);

        // Display updated car details
        System.out.println("\nUpdated Car Details:");
        System.out.println("Company Name: " + myCar.getCompanyName());
        System.out.println("Model Name: " + myCar.getModelName());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Mileage: " + myCar.getMileage() + " miles");
    }
}
