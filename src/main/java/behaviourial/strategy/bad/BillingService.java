package behaviourial.strategy.bad;

public class BillingService {

    public void pay(String type, int amount) {

        if (type.equals("CASH")) {
            System.out.println("Paying " + amount + " using cash");

        } else if (type.equals("CARD")) {
            System.out.println("Paying " + amount + " using card");

        } else if (type.equals("UPI")) {
            System.out.println("Paying " + amount + " using UPI");
        }
    }
}
