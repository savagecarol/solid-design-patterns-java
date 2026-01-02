package behaviourial.strategy.good;

public class CardPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using card");
    }
}
