package creational.abstractFactory.good;

public class AmericanFactory implements CuisineFactory {

    @Override
    public Food getFood() {
        return new Pizza();
    }

    @Override
    public Drink getDrink() {
        return new Coke();
    }
}