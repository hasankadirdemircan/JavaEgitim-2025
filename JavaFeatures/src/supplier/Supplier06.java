package supplier;

import java.util.Optional;
import java.util.function.Supplier;

public class Supplier06 {
    public static void main(String[] args) {
        Employee employee = findNameById(1L).orElseGet(() -> factory( () ->new Employee(2L, "java", 2020)));
        System.out.println(employee.toString());
    }

    private static Optional<Employee> findNameById(Long id) {
        Employee employee;
        if(id == 1L) {
            employee = factory(() -> new Employee(1L, "java8", 25));
        }else {
            employee = null;
        }

        return Optional.ofNullable(employee);
    }

    private static Employee factory(Supplier<? extends Employee> s) {
        Employee employee = s.get();
        return employee;
    }
}
