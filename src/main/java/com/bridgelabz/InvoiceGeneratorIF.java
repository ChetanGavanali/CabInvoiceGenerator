package com.bridgelabz;

import java.util.ArrayList;

public class InvoiceGeneratorIF {
    public double calculateFare(double distance, int time) {
        return 0;
    }

    public double calculateFare(Ride[] rides) {
        return 0;
    }

    public InvoiceSummary calculateFareReturnObject(ArrayList<Ride> rides) {
        return null;
    }
}
