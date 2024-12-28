package aggregation_composition;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("street1", "city 1");
        AggregateEmployee aggregateEmployee = new AggregateEmployee(1, "Kadir", address);
        System.out.println(aggregateEmployee);
        aggregateEmployee = null;
        System.out.println(aggregateEmployee);
        System.out.println(address);

        System.out.println("composition");
        CompositeEmployee compositeEmployee = new CompositeEmployee(1, "Kadir", "street 1", "city 1");
        System.out.println(compositeEmployee);
        System.out.println(compositeEmployee.getAddress());
        compositeEmployee = null;
       // System.out.println(compositeEmployee.getAddress()); .NullPointerException
    }
}
