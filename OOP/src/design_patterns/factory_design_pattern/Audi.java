package design_patterns.factory_design_pattern;

public class Audi implements Car {
    @Override
    public void name() {
        System.out.println("Car name is :  Audi");
    }

    @Override
    public void price(int price) {
        System.out.println("Audi price is : " + price);
    }
}
