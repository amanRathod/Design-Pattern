package StrategyPattern.withStrategyPattern;

import StrategyPattern.withStrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.withStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
