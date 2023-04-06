package StrategyPattern.withStrategyPattern;

import StrategyPattern.withStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    // has-a relationship (-->)
    DriveStrategy driveObject;

    // this is known as Constructor injection
    Vehicle(DriveStrategy obj) {
        driveObject = obj;
    }

    public void drive() {
        driveObject.drive();
    }
}
