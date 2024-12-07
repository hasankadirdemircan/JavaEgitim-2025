package inheritance_homework;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("audi", 2023, "a3", 4);
        Motorcycle motorcycle = new Motorcycle("yamaha", 2025, "r25", false);
        Truck truck = new Truck("Scania", 2024, "v8", 50000);

        car.start();
        car.stop();
        System.out.println("num doors : " + car.getNumDoors());
        System.out.println("brand: " + car.getBrand());

        motorcycle.start();
        motorcycle.stop();
        System.out.println("model " + motorcycle.getModel());

        truck.start();
        truck.stop();
    }
}
