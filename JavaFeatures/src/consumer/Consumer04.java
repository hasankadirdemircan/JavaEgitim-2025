package consumer;

import java.util.ArrayList;
import java.util.List;

public class Consumer04 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 15));
        productList.add(new Product("Phone", 5));
        productList.add(new Product("Tablet", 3));

        for(Product product : productList) {
            System.out.println("productName : " + product.getName() + " price : " + product.getPrice());
        }

        System.out.println("new---");
        productList.forEach(p ->  System.out.println("productName : " + p.getName() + " price : " + p.getPrice()));
    }
}
