package StrategyPattern.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive() {
        // different drive logic
        // both OffRoadVehicle and SportsVehicle class need similar drive method but
        // its different from parent Vehicle class drive method so there is duplicate code on both class
        System.out.println("sports drive capability");
    }
}
