package behaviourial.state.bad;

public class Order {

    private String state = "NEW";

    public void next() {

        if (state.equals("NEW")) {
            System.out.println("Order placed. Start cooking.");
            state = "COOKING";

        } else if (state.equals("COOKING")) {
            System.out.println("Order cooked. Ready to serve.");
            state = "READY";

        } else if (state.equals("READY")) {
            System.out.println("Order delivered to customer.");
            state = "DELIVERED";

        } else {
            System.out.println("Order already delivered.");
        }
    }
}
