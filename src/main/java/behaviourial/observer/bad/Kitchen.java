package behaviourial.observer.bad;

public class Kitchen {
    public void prepareFood(String order) {
        System.out.println("Kitchen notified. Preparing: " + order);
    }
}
