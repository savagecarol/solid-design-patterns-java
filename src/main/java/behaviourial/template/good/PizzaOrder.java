package behaviourial.template.good;

public class PizzaOrder extends FoodOrderTemplate {

    @Override
    protected void prepareFood() {
        System.out.println("Preparing pizza");
    }
}
