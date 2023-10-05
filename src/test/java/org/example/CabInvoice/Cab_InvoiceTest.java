package org.example.CabInvoice;

import org.example.CabInvoice.Cab_Invoice;
import org.junit.Assert;
import org.junit.Test;

import static org.example.CabInvoice.InvoiceSum.expectedInvoiceSum;

public class Cab_InvoiceTest {

    Cab_Invoice cabInvoice=new Cab_Invoice();
@Test
    public void givenDistanceAndTime_ShouldReturn(){
        double distance=2;
        int time=5;
        double result=cabInvoice.calculateFare(distance,time);
        Assert.assertEquals(25,result,0);
    }
//Multiple rides Unit TestCase......UC2...!..
    @Test
    public void givenMultipleRides(){
    Ride rides[] = {new Ride(2.0,5),new Ride(0.1,1)};
    double result=cabInvoice.calculateFare(rides);
    Assert.assertEquals(30.0,result,0.0);
    }

   // UC3...............
    @Test
    public void givenMultipleRidesInvoiceSum(){
    Ride1 ride1[]={new Ride1(2.0,5),new Ride1(0.1,1)};
    InvoiceSum summary=cabInvoice.calculateFare(ride1);
    expectedInvoiceSum=new InvoiceSum(2,30);
    Assert.assertEquals(expectedInvoiceSum,summary);
    }
}
