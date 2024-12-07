package inheritance_homework;

public class Motorcycle extends Vehicle {

    private boolean hasSideCar;

    public Motorcycle(String brand, int year, String model, boolean hasSideCar) {
        super(brand, year, model);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping");
    }
}
