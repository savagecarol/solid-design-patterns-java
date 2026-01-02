package behaviourial.observer.good;

public class Kitchen implements OrderObserver {
    @Override
    public void update(String order) {
        System.out.println("Kitchen notified. Preparing: " + order);
    }
}
