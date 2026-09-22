package ro.scoalainformaladavid;

public class Main {
    public static void main(String[] args) {
        Car car = new Logan(27, "oiqe0934hkkadsn"); // Logan can extend from Dacia, while Dacia extends from Car

        car.start();
        car.drive(24);
        car.stop();

        float availableFuel = car.getAvailableFuel();

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();
        System.out.println("Available Fuel " + availableFuel);
    }
}
