package structural.adpator.bad;

/**
 * Adapter Pattern allows incompatible interfaces to work together.
 *
 * story :: => previously i only take payment in cash
 *       :: => now i want to take payment online and cash both
 *
 *     Remember :: at the end money is just going to bank account [either cash or online doesn't matter]
 *
 *     so basically we want to make new functionality -> and previous function should not break
 *
 *     so, there is a cashier who knows how to take cash payment
 *     so we will make adaptor :: that adaptor will take online payment and pass it to cashier in cash
 *     in real world you can assume it like ATM in front or restraunt because restraunt only take cash
 *     but atm can help you to get cash
 */
public class Restaurant {
    public static void main(String[] args) {
        OldBillingSystem billing = new OldBillingSystem();
        billing.payInCash(500);
        // New payment system - incompatible
        OnlinePaymentService online = new OnlinePaymentService();
        online.payOnline(600); // supports only online but i need machine to convert to cash
        // billing.payInCash(online);  // not possible
    }
}


