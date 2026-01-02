package behaviourial.template.bad;

public class BurgerOrder {

    public void processOrder() {
        takeOrder();
        prepareBurger();
        serve();
        bill();
    }

    private void takeOrder() {
        System.out.println("Taking burger order");
    }

    private void prepareBurger() {
        System.out.println("Preparing burger");
    }

    private void serve() {
        System.out.println("Serving burger");
    }

    private void bill() {
        System.out.println("Generating burger bill");
    }
}
