package aston.hometask.first.Vehicle;

public class Starter {
    public static void main(String[] args) {
        Airplane airplane = new Vehicles("Самолет");
        airplane.takeCargo();
        airplane.flyUp();
        airplane.land();
        airplane.putCargo();

        System.out.println();
        Taxi taxi = new Vehicles("Такси");
        taxi.rotate();
        taxi.getPassenger();
        taxi.rotate();
        taxi.finishTrip();
    }
}
