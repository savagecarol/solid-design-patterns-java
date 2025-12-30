package solid.interfaceSegregation.bad;

// Do not force a class to implement unused methods
// story : One big interface for Waiter + Chef + Billing - one person cannot do everything receptionist cannot be chef
public class Restaurant  {
    public static void main(String[] args) {
        System.out.println("Lets order");
        Order order = new Order();
        order.takeOrder(); // I can take order
        order.cookFood(); // lol no - I don't know
        order.generateBill(); // lol no - I don't know
    }
}
