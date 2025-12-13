package com.derick.java17;

// Sealed class allowing only specific subclasses
sealed class Vehicle permits Car, Bike {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Permitted subclass
final class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving...");
    }
}

// Permitted subclass
final class Bike extends Vehicle {
    public void ride() {
        System.out.println("Bike is riding...");
    }
}

//❌ The following will cause a compilation error
/*final class Truck extends Vehicle {
    public void ride() {
        System.out.println("Bike is riding...");
    }
}*/

// class Truck extends Vehicle {} // Not permitted!

public class F2_SealedClasses {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // ✅ Allowed
        car.drive(); // ✅ Allowed

        Bike bike = new Bike();
        bike.start(); // ✅ Allowed
        bike.ride(); // ✅ Allowed

    }
}
