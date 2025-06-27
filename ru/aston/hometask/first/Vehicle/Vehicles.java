package aston.hometask.first.Vehicle;

public class Vehicles implements Airplane, Helicopter, Speedboat, Tanker, Truck, Taxi {
    private String type;
    public Vehicles (String type) {
        this.type = type;
    }

    @Override
    public void flyUp() {
        System.out.println(String.format("*%s взлетает*", type));
    }

    @Override
    public void land() {
        System.out.println(String.format("*%s приземлился*", type));
    }

    @Override
    public void sail() {
        System.out.println(String.format("*%s идет по воде*", type));
    }

    @Override
    public void takeCargo() {
        System.out.println(String.format("*%s забрал груз*", type));
    }

    @Override
    public void putCargo() {
        System.out.println(String.format("*%s доставил груз*", type));
    }

    @Override
    public void creak() {
        System.out.println(String.format("*%s скрипит*", type));
    }

    @Override
    public void getPassenger() {
        System.out.println(String.format("*%s забрал пассажира*", type));
    }

    @Override
    public void finishTrip() {
        System.out.println(String.format("*%s завершил поездку*", type));
    }

    @Override
    public void noise() {
        System.out.println(String.format("*%s гудит*", type));
    }

    @Override
    public void rotate() {
        System.out.println(String.format("*%s вращает колеса*", type));
    }
}