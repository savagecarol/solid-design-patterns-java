package structural.decorator.good;


public class Cheese extends ToppingDecorator {

    public Cheese(Food food) {
        super(food);
    }

    @Override
    public int cost() {
        return food.cost() + 50;
    }

    @Override
    public String description() {
        return food.description() + ", Cheese";
    }
}
