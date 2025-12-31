package structural.adpator.good;

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
