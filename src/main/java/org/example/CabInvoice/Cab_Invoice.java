package org.example.CabInvoice;

public class Cab_Invoice {
    public static final double costperkm = 10.0;
    public static final double costpermin = 1.0;
    public static final double min_fare = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = (distance * costperkm) + (time * costpermin);
        if (totalFare < 5) {
            return min_fare;
        }
        return totalFare;
    }

    //Multiple rides...UC2
    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare = totalFare + this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }

// UC3...............................
    public InvoiceSum calculateFare(Ride1[] ride1){
        double totalFare=0;
        for(Ride1 ride:ride1){
            totalFare=totalFare+this.calculateFare(ride.distance,ride.time);
        }
        return new InvoiceSum(ride1.length,totalFare);
    }
}
