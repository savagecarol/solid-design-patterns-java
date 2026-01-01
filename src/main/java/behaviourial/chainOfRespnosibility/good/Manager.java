package behaviourial.chainOfRespnosibility.good;

public class Manager extends Handler {
    @Override
    public void handleOrder(String order) {
        System.out.println("Manager handled the special order: " + order);
    }
}
