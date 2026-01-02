package behaviourial.observer.good;

public class Billing implements OrderObserver {
    @Override
    public void update(String order) {
        System.out.println("Billing notified. Billing for: " + order);
    }
}
