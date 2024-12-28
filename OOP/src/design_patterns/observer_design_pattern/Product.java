package design_patterns.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String productName;
    private boolean available;
    private List<Observer> listOfObserver = new ArrayList<>();

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if(available) {
            notifyObservers();
        }
    }

    public List<Observer> getListOfObserver() {
        return listOfObserver;
    }

    public void setListOfObserver(List<Observer> listOfObserver) {
        this.listOfObserver = listOfObserver;
    }

    @Override
    public void registerObserver(Observer observer) {
        listOfObserver.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listOfObserver.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Haber almak isteyen müşterilere ürünün geldiği haberi veriliyor.");
        for(Observer observer : listOfObserver) {
            observer.update(productName);
        }
    }
}
