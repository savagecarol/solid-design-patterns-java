package solid.dependencyInversion.good;

import solid.dependencyInversion.bad.Pizza;

// should order service know which food to create
// now order service is only taking Food but dont know what to create -> it is just passing it to food interface
public class OrderService {
    private Food food;

    // Dependency injected
    public OrderService(Food food) {
        this.food = food;
    }

    public void processOrder() {
        food.prepare();
    }

}
