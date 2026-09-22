package ro.scoalainformaladavid;

public abstract class Dacia extends Car {
    public Dacia(int fuelTankSize, FuelType fuelType, int gears, double consumptionPer100Km, float availableFuel, int tireSize, String chassisNumber) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km, availableFuel,
                tireSize, chassisNumber);
    }
}
