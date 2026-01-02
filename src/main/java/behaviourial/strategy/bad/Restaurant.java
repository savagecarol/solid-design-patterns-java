package behaviourial.strategy.bad;

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
 */
public class Restaurant {
    public static void main(String[] args) {

        System.out.println("Customer wants to pay bill");

        BillingService billing = new BillingService();
        billing.pay("CARD", 500);
    }
}
