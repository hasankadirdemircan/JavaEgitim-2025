package design_patterns.factory_design_pattern;

import java.lang.reflect.InvocationTargetException;

public class CarFactory {

    public static Car createCar(Class aClass) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (Car) aClass.getDeclaredConstructor().newInstance();
    }
}
