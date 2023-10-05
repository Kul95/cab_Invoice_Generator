package org.example.CabInvoice;

import java.util.Objects;

public class InvoiceSum {
    public static InvoiceSum expectedInvoiceSum;
    public final double numOfRides;
    public final double totalFare;
    public final double avrageFare;
    public InvoiceSum(int numOfRides,double totalFare){
        this.numOfRides=numOfRides;
        this.totalFare=totalFare;
        this.avrageFare=this.totalFare/numOfRides;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSum that = (InvoiceSum) o;
        return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.avrageFare, avrageFare) == 0;
    }
}
