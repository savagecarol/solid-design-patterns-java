package structural.adpator.good;

public class OldBillingSystem implements BillingSystem {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " in cash"); // pay in cash
    }
}
