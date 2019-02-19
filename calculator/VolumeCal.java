package com.example.calculator;

public class VolumeCal {
    public String litersCal(double input){
        double fOunces = input * 33.814;
        double quarts = input * 1.05669;
        double gallons = input * 0.264172;
        double iGallons = input * 0.219969;
        String output = fOunces + " fluid ounces\n" + quarts + " quarts\n" + gallons + " gallons\n" + iGallons + " imperial gallons";
        return output;
    }
    public String fOuncesCal(double input){
        double liters = input * 0.0295735;
        double quarts = input * 0.03125;
        double gallons = input * 0.0078125;
        double iGallons = input * 0.00650527;
        String output = liters + " liters\n" + quarts + " quarts\n" + gallons + " gallons\n" + iGallons + " imperial gallons";
        return output;
    }
    public String quartsCal(double input){
        double liters = input * 0.946353;
        double fOunces = input * 32;
        double gallons = input * 0.25;
        double iGallons = input * 0.208169;
        String output = liters + " liters\n" + fOunces + " fluid ounces\n" + gallons + " gallons\n" + iGallons + " imperial gallons";
        return output;
    }
    public String gallonsCal(double input){
        double liters = input * 3.78541;
        double fOunces = input * 128;
        double quarts = input * 4;
        double iGallons = input * 0.832674;
        String output = liters + " liters\n" + fOunces + " fluid ounces\n" + quarts + " quarts\n" + iGallons + " imperial gallons";
        return output;
    }
    public String iGallonsCal(double input){
        double liters = input * 4.54609;
        double fOunces = input * 153.722;
        double quarts = input * 4.8038;
        double gallons = input * 1.20095;
        String output = liters + " liters\n" + fOunces + " fluid ounces\n" + quarts + " quarts\n" + gallons + " gallons";
        return output;
    }
}
