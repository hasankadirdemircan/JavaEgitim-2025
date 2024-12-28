package design_patterns.observer_design_pattern;


public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerName("ahmet");

        Customer customer2 = new Customer();
        customer2.setCustomerName("ayşe");

        Product iphone7 = new Product();
        iphone7.setProductName("Apple iphone 7");
        iphone7.setAvailable(false);

        iphone7.registerObserver(customer1);
        iphone7.registerObserver(customer2);

        iphone7.setAvailable(true);

    }
}
