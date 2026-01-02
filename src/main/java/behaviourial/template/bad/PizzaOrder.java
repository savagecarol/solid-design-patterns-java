package behaviourial.template.bad;

public class PizzaOrder {

    public void processOrder() {
        takeOrder();
        preparePizza();
        serve();
        bill();
    }

    private void takeOrder() {
        System.out.println("Taking pizza order");
    }

    private void preparePizza() {
        System.out.println("Preparing pizza");
    }

    private void serve() {
        System.out.println("Serving pizza");
    }

    private void bill() {
        System.out.println("Generating pizza bill");
    }
}
