package behaviourial.observer.bad;

public class Billing {
    public void generateBill(String order) {
        System.out.println("Billing notified. Billing for: " + order);
    }
}
