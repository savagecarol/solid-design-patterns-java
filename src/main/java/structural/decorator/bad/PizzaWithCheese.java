package structural.decorator.bad;

public class PizzaWithCheese extends Pizza {
    @Override
    public int cost() {
        return super.cost() + 50;
    }
}
