package behaviourial.observer.good;

public class Display implements OrderObserver {
    @Override
    public void update(String order) {
        System.out.println("Display shows new order: " + order);
    }
}
