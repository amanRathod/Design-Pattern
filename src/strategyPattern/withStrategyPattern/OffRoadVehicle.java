package StrategyPattern.withStrategyPattern;

import StrategyPattern.withStrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.withStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
