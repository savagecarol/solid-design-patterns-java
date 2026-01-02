package solid.interfaceSegregation.bad;

// Do not force a class to implement unused methods
// story : One big interface for Waiter + Chef + Billing - one person cannot do everything waiter cannot be chef
public class Restaurant  {
    public static void main(String[] args) {
        System.out.println("Lets order");
        Waiter waiter = new Waiter(); // extend with staff interface
        waiter.takeOrder(); // I can take order
        waiter.cookFood(); // lol no - I don't know
        waiter.generateBill(); // lol no - I don't know

        Chef chef = new Chef();
        chef.cookFood();
        chef.takeOrder();
    }
}
