package structural.decorator.good;

public class Olives extends ToppingDecorator {

    public Olives(Food food) {
        super(food);
    }

    @Override
    public int cost() {
        return food.cost() + 30;
    }

    @Override
    public String description() {
        return food.description() + ", Olives";
    }
}
