/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.car;

/**
 *
 * @author USER
 */
class Car {
    // Private instance variables
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    // Constructor
    public Car(String company_name, String model_name, int year, double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage; // Mileage is set during object creation
    }

    // Getter for company_name
    public String getCompanyName() {
        return company_name;
    }

    // Setter for company_name
    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    // Getter for model_name
    public String getModelName() {
        return model_name;
    }

    // Setter for model_name
    public void setModelName(String model_name) {
        this.model_name = model_name;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for mileage
    public double getMileage() {
        return mileage;
    }
}



