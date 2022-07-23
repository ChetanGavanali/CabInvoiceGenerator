package com.bridgelabz;

import java.util.ArrayList;

public abstract class InvoiceGeneratorIF {
    public double calculateFare(double distance, int time) {
        return 0;
    }

    public double calculateFare(Ride[] rides) {
        return 0;
    }

    public InvoiceSummary calculateFareReturnObject(ArrayList<Ride> rides) {
        return null;
    }

    public abstract double calculateFare(double distance, int time, String type);

    public abstract double calculateFare(Ride[] rides, String type);

    public abstract InvoiceSummary calculateFareReturnObject(ArrayList<Ride> rides, String type);
}
