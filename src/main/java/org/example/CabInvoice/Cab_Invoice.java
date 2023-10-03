package org.example.CabInvoice;

public class Cab_Invoice {

    public static final double costperkm=10.0;
    public static final double costpermin=1.0;
    public static final double min_fare=5;
    public double calculateFare(double distance,int time){
        double totalFare=(distance*costperkm)+(time*costpermin);
        if(totalFare<5){
            return  min_fare;
        }
        return  totalFare;
    }
}
