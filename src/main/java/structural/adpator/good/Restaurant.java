package structural.adpator.good;

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
 *
 *
 *      we make one Adapter class
 *     that will help new functionality to connect with old functionalities
 */
public class Restaurant {

    public static void main(String[] args) {
        BillingSystem cashPayment = new OldBillingSystem();
        cashPayment.pay(500);
        BillingSystem onlinePayment = new PaymentAdapter(new OnlinePaymentService());
        onlinePayment.pay(800);
    }
}
