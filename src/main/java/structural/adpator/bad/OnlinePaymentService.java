package structural.adpator.bad;

// it is not support pay in cash functionality
public class OnlinePaymentService {
    public void payOnline(int amount) {
        System.out.println("Paid " + amount + " via online payment");
    }
}
