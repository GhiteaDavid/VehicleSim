package ro.scoalainformaladavid;

public class Logan extends Dacia {
    private static final int FUEL_TANK_SIZE = 60;
    private static final FuelType FUEL_TYPE = FuelType.DIESEL;
    private static final int GEARS = 5;
    private static final float CONSUMPTION_PER_100KM = 4.7f;
    private static final int TIRE_SIZE = 15;

    public Logan(float availableFuel, String chassisNumber) {
        super(FUEL_TANK_SIZE, FUEL_TYPE, GEARS, CONSUMPTION_PER_100KM, availableFuel, TIRE_SIZE, chassisNumber);
    }

}
