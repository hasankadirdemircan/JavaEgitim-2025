package function;

import java.util.ArrayList;
import java.util.List;

public class Function05 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("abcd", 20);
        Employee employee2 = new Employee("bcd", 21);
        Employee employee3 = new Employee("cd", 22);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        employeeList.stream().filter(e -> e.getAge() >= 21).map(e -> e.getName()).map(e -> e.length()).filter(e -> e > 2).forEach(System.out::println);
    }
}
