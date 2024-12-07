package inheritance_homework;

public class Car extends Vehicle {

    private int numDoors;

    public Car(String brand, int year, String model, int numDoors) {
        super(brand, year, model);
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    public int getNumDoors() {
        return numDoors;
    }
}
