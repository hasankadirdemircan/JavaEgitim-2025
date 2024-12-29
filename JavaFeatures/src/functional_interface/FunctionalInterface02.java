package functional_interface;

import java.lang.Object;

@FunctionalInterface
public interface FunctionalInterface02 {
    public boolean equals(Object o); // method java.lang.Object sınıfndan geliyorsa, bu sayılmaz.
    public void sayHello();
}
