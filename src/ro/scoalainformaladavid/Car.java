package ro.scoalainformaladavid;

public abstract class Car implements Vehicle {
    private final int fuelTankSize;
    private final FuelType fuelType;
    private final int gears;
    private final double consumptionPer100Km;
    private float availableFuel;
    private int tireSize;
    private final String chassisNumber;
    private int currentGear;
    private float totalConsumption;
    private boolean isRunning = false;
    private float kmDriven;
    private float averageFuelConsumption;

    public Car(int fuelTankSize, FuelType fuelType, int gears, double consumptionPer100Km, float availableFuel, int tireSize, String chassisNumber) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = availableFuel;
        this.tireSize = tireSize;
        this.chassisNumber = chassisNumber;
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(float availableFuel) {
        if (availableFuel >= 0 && availableFuel <= fuelTankSize) {
            this.availableFuel = availableFuel;
        } else {
            System.out.println("Invalid fuel available");
        }
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        if (tireSize >= 15 && tireSize <= 23) {
            this.tireSize = tireSize;
        } else {
            System.out.println("Invalid tire size");
        }
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public int getGears() {
        return gears;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public float getKmDriven() {
        return kmDriven;
    }

    public float getAverageFuelConsumption() {
        if (kmDriven == 0) {
            System.out.println("You Drove 0 Km");
            return 0;
        } else {
            return (totalConsumption / kmDriven) * 100;
        }
    }

    public void shiftGear(int gear) {
        if (gear >= 1 && gear <= gears) {
            currentGear = gear;
        } else {
            System.out.println("Invalid gear");
        }
    }

    @Override
    public void start() {
        isRunning = true;
        currentGear = 1;
        totalConsumption = 0;
        kmDriven = 0;
        System.out.println("Car started");
    }

    @Override
    public void drive(double kms) {
        double consumedNow;
        if (kms < 0) {
            throw new IllegalArgumentException("Invalid kms given");
        }
        if (isRunning) {
            consumedNow = (consumptionPer100Km * kms) / 100;
            totalConsumption += consumedNow;
            availableFuel -= consumedNow;
            kmDriven += kms;
            if (availableFuel <= 0) {
                throw new IllegalStateException("The car ran out of fuel.");
            }
        } else {
            System.out.println("Car Engine Is Not Running");
        }
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Car stopped");
    }

    public boolean isRunning() {
        return isRunning;
    }


}
