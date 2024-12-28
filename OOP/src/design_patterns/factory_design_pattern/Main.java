package design_patterns.factory_design_pattern;

import interface_ex.A;

import java.lang.reflect.InvocationTargetException;

public class Main {


    public static void main(String[] args) {
       Audi audi = new Audi();
        audi.name();
        audi.price(50);

        try{
            Bmw bmw = (Bmw) CarFactory.createCar(Bmw.class);
            bmw.name();
            bmw.price(5);

            Porsche porsche = (Porsche) CarFactory.createCar(Porsche.class);
            porsche.name();
            porsche.price(51);
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
