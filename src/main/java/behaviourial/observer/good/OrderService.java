package behaviourial.observer.good;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements OrderSubject {

    private List<OrderObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String order) {
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }

    public void placeOrder(String order) {
        System.out.println("Order placed: " + order);
        notifyObservers(order); // publishing
    }
}
