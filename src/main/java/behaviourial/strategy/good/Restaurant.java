package behaviourial.strategy.good;

/**
 * Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable at runtime.
 *
 * story ::
 * Customer wants to pay the bill.
 * Payment methods:
 * Cash
 * Card
 * UPI
 *
 * problems::
 *  One class knows all strategies
 *  Violates Open/Closed Principle
 *  if–else grows endlessly
 *  Adding new payment → modify class
 *
 * solution::
 *      1. make strategy interface
 *      2. all the methods [card , cash , upi] will implement that strategy
 *      3. and billing service will only talk to strategy
 *
 *   it follows open-closed principle
 *   no if-else
 *
 */
public class Restaurant {

    public static void main(String[] args) {

        System.out.println("Customer wants to pay bill");

        BillingService billing = new BillingService();

        billing.setPaymentStrategy(new CardPayment());
        billing.pay(500);

        billing.setPaymentStrategy(new CashPayment());
        billing.pay(300);

        billing.setPaymentStrategy(new UpiPayment());
        billing.pay(200);
    }
}
