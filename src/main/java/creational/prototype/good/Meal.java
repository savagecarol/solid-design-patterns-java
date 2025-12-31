package creational.prototype.good;

public class Meal implements Cloneable {

    private String food;
    private String drink;
    public boolean extraCheese;

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Meal(String food, String drink, boolean extraCheese) {
        this.food = food;
        this.drink = drink;
        this.extraCheese = extraCheese;
    }

    // clone function for cloning the objects
    @Override
    protected Meal clone() {
        return new Meal(food, drink, extraCheese);
    }

    public void showMeal() {
        System.out.println(food + " | " + drink + " | extra cheese: " + extraCheese);
    }
}
