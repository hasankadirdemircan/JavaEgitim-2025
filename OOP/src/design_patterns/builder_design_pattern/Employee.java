package design_patterns.builder_design_pattern;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer age;
    private String position;
    private Double salary;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.position = employeeBuilder.position;
        this.salary = employeeBuilder.salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public Double getSalary() {
        return salary;
    }

    public static class EmployeeBuilder{
        private String firstName;
        private String lastName;
        private Integer age;
        private String position;
        private Double salary;

        /**
         *
         * @param firstName -> required field
         * @param position -> required field
         */
        public EmployeeBuilder(String firstName, String position) {
            this.firstName = firstName;
            this.position = position;
        }

        /**
         *
         * @param lastName -> Optional field
         * @return
         */
        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         *
         * @param age -> Optional field
         * @return
         */
        public EmployeeBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        /**
         *
         * @param salary -> Optional field
         * @return
         */
        public EmployeeBuilder setSalary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
