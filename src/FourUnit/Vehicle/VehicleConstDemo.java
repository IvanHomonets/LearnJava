package FourUnit.Vehicle;

public class VehicleConstDemo {
    public static void main(String[] args) {
        double minivanGallons;
        double sportscarGallons;
        int distance = 252;

        Vehicle minivan = new Vehicle(8, 20, 4); // this is an object minivan of class Vehicle
        Vehicle sportscar = new Vehicle(2, 200, 20); // this is object sportcar of class Vehicle

        minivanGallons = minivan.fuelNeeded(distance);
        sportscarGallons = sportscar.fuelNeeded(distance);

        System.out.println(" Minivan could go " + distance+ " and it needs " + minivanGallons + " gallons");

    }
}
