package ro.scoalainformaladavid;

public class VWGolf extends Volkswagen {
    private static final int FUEL_TANK_SIZE = 50;
    private static final FuelType FUEL_TYPE = FuelType.PETROL;
    private static final int GEARS = 6;
    private static final float CONSUMPTION_PER_100KM = 7.0f;
    private static final int TIRE_SIZE = 15;

    public VWGolf(float availableFuel, String chassisNumber) {
        super(FUEL_TANK_SIZE, FUEL_TYPE, GEARS, CONSUMPTION_PER_100KM, availableFuel, TIRE_SIZE, chassisNumber);
    }
}
