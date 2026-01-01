package structural.decorator.bad;

public class PizzaWithOlives extends Pizza {
    @Override
    public int cost() {
        return super.cost() + 30;
    }
}
