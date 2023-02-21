package org.scaler.access1;

public class VehicleRunner {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.wheels);
        System.out.println(car.canRun());
        car.setMedium("water");
        System.out.println(car.canRun());
    }
}
