package design_patterns.builder_design_pattern;

public class Main {
    public static void main(String[] args) {
       // Employee employee = new Employee()
        Employee kadir = new Employee.EmployeeBuilder("Kadir", "Java Developer").build();
        System.out.println(kadir);

        Employee alp = new Employee
                .EmployeeBuilder("alp", "Java Developer")
                .setAge(25)
                .setLastName("x")
                .setSalary(5.0)
                .build();

        System.out.println(alp);
    }
}
