package structural.adpator.good;

/**
 *  1. implement the interface
 *  2. we are going to the make the variable of incompatible service and pass it into the constructor
 */
public class PaymentAdapter implements BillingSystem {

    private OnlinePaymentService onlinePayment;

    public PaymentAdapter(OnlinePaymentService onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    @Override
    public void pay(int amount) {
        onlinePayment.payOnline(amount);
    }
}
