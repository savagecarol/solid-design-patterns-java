package solid.interfaceSegregation.good;


// Do not force a class to implement unused methods
// story : make small  interface - everyone can do seperate work chef can cook, billing guy will do billing
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Lets order");
        Order order = new Order();
        order.takeOrder(); // I can take order
        Chef chef = new Chef();
        chef.cookFood(); // I can cook
        Billing billing = new Billing();
        billing.generateBill(); // I can generate bill
    }
}
