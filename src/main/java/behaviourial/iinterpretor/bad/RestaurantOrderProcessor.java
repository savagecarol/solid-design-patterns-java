package behaviourial.iinterpretor.bad;

public class RestaurantOrderProcessor {

    public void process(String order) {

        // we can make so many if else commands
        if (order.contains("Pizza") && order.contains("Coke")) {
            System.out.println("Preparing Pizza");
            System.out.println("Serving Coke");
        }
        else if (order.contains("Pizza") || order.contains("Coke")) {
            System.out.println("Preparing Pizza");
            System.out.println("Serving Coke");
        }
        else if (order.contains("Burger")) {
            System.out.println("Preparing Burger");
        }
        else {
            System.out.println("Unknown order");
        }
    }
}
