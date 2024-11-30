package class_object;

public class Customer {

    String id;
    String bankNumber;
    String firstName;
    String lastName;
    int age;
    String address;
    double salary;

    public void deposit() {

    }

    public void withdraw() {

    }

    public void getCreditRisk() {

    }

    public double getCreditLimit() {
        return salary + (salary * 0.5);
    }
}
