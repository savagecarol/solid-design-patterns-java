package structural.decorator.good;

// we made one decorator class that will take food -> right now pizza
// now we can decoreate it with cheese . olives and both also
public abstract class ToppingDecorator implements Food {

    protected Food food;

    protected ToppingDecorator(Food food) {
        this.food = food;
    }
}
