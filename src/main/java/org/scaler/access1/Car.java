package org.scaler.access1;

public class Car extends Vehicle {
    int wheels = 4;

    public boolean canRun() {
        return this.canBeDriven();
    }
}
