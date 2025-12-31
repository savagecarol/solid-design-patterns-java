package solid.dependencyInversion.bad;

// should order service know which food to create
// order service responsibility to take order
public class OrderService {
    private Pizza pizza = new Pizza(); // tight coupling
    public void processOrder() {
        pizza.prepare();
    }
}
