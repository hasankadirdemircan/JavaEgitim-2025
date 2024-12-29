package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Function03 {

    public static void main(String[] args) {
        Function<Employee, String> employeeToStringName = e -> e.getName();
        Employee employee = new Employee("kadir", 29);
        System.out.println(employeeToStringName.apply(employee));
        String name = employeeToStringName.apply(employee);
        System.out.println("name : " + name);

        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("a", 20);
        Employee employee2 = new Employee("b", 21);
        Employee employee3 = new Employee("c", 22);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        List<String> employeeNameList = employeeList.stream().map(e -> e.getName()).toList();
        System.out.println("employeeNameList : " + employeeNameList);

        List<String> employeeNameList2 = employeeList.stream().filter(e -> e.getAge() >= 21).map(e -> e.getName()).toList();
        System.out.println("employeeNameList2 : " + employeeNameList2);

        System.out.println("predicate -> function -> consumer");
        employeeList.stream().filter(e -> e.getAge() >= 21).map(e -> e.getName()).forEach(System.out::println);
    }
}
