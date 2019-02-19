package com.example.calculator;

public class DistanceCal {
    public String meterCal(double input){
        double inches = input * 39.3701;
        double feet = input * 3.28084;
        double yards = input * 1.09361;
        double miles = input * 0.000621371;
        double nMiles = input * 0.000539957;
        String output = inches + " inches\n" + feet + " feet\n" + yards + " yards\n" + miles + " miles\n" + nMiles + " nautical miles";
        return output;
    }
    public String inchesCal(double input){
        double meters = input * 0.02540;
        double feet = input * 0.08333;
        double yards = input * 0.02778;
        double miles = input * 0.000015783;
        double nMiles = input * 0.000013715;
        String output = meters + " meters\n" + feet + " feet\n" + yards + " yards\n" + miles + " miles\n" + nMiles + " nautical miles";
        return output;
    }
    public String feetCal(double input){
        double meters = input * 0.30480;
        double inches = input * 12;
        double yards = input * 0.33333;
        double miles = input * 0.000189394;
        double nMiles = input * 0.000164579;
        String output = meters + " meters\n" + inches + " inches\n" + yards + " yards\n" + miles + " miles\n" + nMiles + " nautical miles";
        return output;
    }
    public String yardsCal(double input){
        double meters = input * 0.91440;
        double inches = input * 36;
        double feet = input * 3;
        double miles = input * 0.000568182;
        double nMiles = input * 0.000493737;
        String output = meters + " meters\n" + inches + " inches\n" + feet + " feet\n" + miles + " miles\n" + nMiles + " nautical miles";
        return output;
    }
    public String milesCal(double input){
        double meters = input * 1609.34;
        double inches = input * 63360.0;
        double feet = input * 5280.0;
        double yards = input * 1760.0;
        double nMiles = input * 0.868976;
        String output = meters + " meters\n" + inches + " inches\n" + feet + " feet\n" + yards + " yards\n" + nMiles + " nautical miles";
        return output;
    }
    public String nMilesCal(double input){
        double meters = input * 1852.00;
        double inches = input * 72913.4;
        double feet = input * 6076.12;
        double yards = input * 2025.37;
        double miles = input * 1.15078;
        String output = meters + " meters\n" + inches + " inches\n" + feet + " feet\n" + yards + " yards\n" + miles + " miles";
        return output;
    }
}
