package behaviourial.template.good;

public abstract class FoodOrderTemplate {

    // Template method (final = cannot change order)
    public final void processOrder() {
        takeOrder();
        prepareFood();
        serveFood();
        generateBill();
    }

    protected void takeOrder() {
        System.out.println("Taking order");
    }

    protected abstract void prepareFood(); // dynamic pattern is abstract

    protected void serveFood() {
        System.out.println("Serving food");
    }

    protected void generateBill() {
        System.out.println("Generating bill");
    }
}
