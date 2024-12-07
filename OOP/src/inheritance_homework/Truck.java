package inheritance_homework;

public class Truck extends Vehicle {

    private double cargoCapacity;

    public Truck(String brand, int year, String model, double cargoCapacity) {
        super(brand, year, model);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }
}
