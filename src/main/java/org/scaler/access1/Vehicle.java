package org.scaler.access1;

public class Vehicle {
    private String medium = "road";

    protected boolean canBeDriven() {
        return medium.equals("road");
    }

    public String setMedium(String medium) {
        this.medium = medium;
        return this.medium;
    }
}
