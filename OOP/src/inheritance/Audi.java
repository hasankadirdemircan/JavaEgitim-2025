package inheritance;

import inheritance.protected_ex.Car;

public class Audi extends Car{

    public void test() {
       // Car car = new Car();
      //  car.startEngine(); //cant get access for protected methods, needs extends,inheritance
          startEngine();
    }
}
