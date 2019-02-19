package com.example.calculator;

public class WeightCal {
    public String kgCal(double input){
        double ounces = input * 35.274;
        double pounds = input * 2.20462;
        double tPounds = input * 2.6793;
        double stones = input * 0.157473;
        double sTons = input * 0.00110231;
        double lTons = input * 0.000984207;
        String output = ounces + " ounces\n" + pounds + " pounds\n" + tPounds + " troy pounds\n" + stones + " stones\n" + sTons + " short tons\n" + lTons + " long tons";
        return output;
    }
    public String ouncesCal(double input){
        double kg = input * 0.0283;
        double pounds = input * 0.0625;
        double tPounds = input * 0.0760;
        double stones = input * 0.00446429;
        double sTons = input * 0.003125;
        double lTons = input * 0.0027902;
        String output = kg + " kilograms\n" + pounds + " pounds\n" + tPounds + " troy pounds\n" + stones + " stones\n" + sTons + " short tons\n" + lTons + " long tons";
        return output;
    }
    public String poundsCal(double input){
        double kg = input * 0.453592;
        double ounces = input * 16.0;
        double tPounds = input * 1.2153;
        double stones = input * 0.0714286;
        double sTons = input * 0.0005;
        double lTons = input * 0.000446429;
        String output = kg + " kilograms\n" + ounces + " ounces\n" + tPounds + " troy pounds\n" + stones + " stones\n" + sTons + " short tons\n" + lTons + " long tons";
        return output;
    }
    public String tPoundsCal(double input){
        double kg = input * 0.3732;
        double ounces = input * 13.165;
        double pounds = input * 0.8228;
        double stones = input * 0.058774;
        double sTons = input * 0.00041142;
        double lTons = input * 0.00037324;
        String output = kg + " kilograms\n" + ounces + " ounces\n" + pounds + " pounds\n" + stones + " stones\n" + sTons + " short tons\n" + lTons + " long tons";
        return output;
    }
    public String stonesCal(double input){
        double kg = input * 6.35029;
        double ounces = input * 224;
        double pounds = input * 14;
        double tPounds = input * 17.014;
        double sTons = input * 0.007;
        double lTons = input * 0.00625;
        String output = kg + " kilograms\n" + ounces + " ounces\n" + pounds + " pounds\n" + tPounds + " troy pounds\n" + sTons + " short tons\n" + lTons + " long tons";
        return output;
    }
    public String sTonsCal(double input){
        double kg = input * 907.185;
        double ounces = input * 32000;
        double pounds = input * 2000;
        double tPounds = input * 2430.6;
        double stones = input * 142.857;
        double lTons = input * 0.892857;
        String output = kg + " kilograms\n" + ounces + " ounces\n" + pounds + " pounds\n" + tPounds + " troy pounds\n" + stones + " stones\n" + lTons + " long tons";
        return output;
    }
    public String lTonsCal(double input){
        double kg = input * 1016.05;
        double ounces = input * 35840;
        double pounds = input * 2240;
        double tPounds = input * 2679.3;
        double stones = input * 160;
        double sTons = input * 1.12;
        String output = kg + " kilograms\n" + ounces + " ounces\n" + pounds + " pounds\n" + tPounds + " troy pounds\n" + stones + " stones\n" + sTons + " short tons";
        return output;
    }
}
