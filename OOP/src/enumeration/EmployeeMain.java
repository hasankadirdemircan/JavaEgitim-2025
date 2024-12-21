package enumeration;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeMain employeeMain = new EmployeeMain();
        employeeMain.comparison(1);
    }

    public void comparison(int value) {
        for (Employee emp : Employee.values()) {
            if (value == emp.getKey()) {
                System.out.println("Gelen degeri : " + value + " olan kisi : " + emp.name());
            }
        }
    }
}

