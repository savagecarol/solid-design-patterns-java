package creational.prototype.good;

import java.util.List;

public class MealShallow implements Cloneable {

    private String food;
    private String drink;
    private List<Extra> extras; // using list

    public MealShallow(String food, String drink, List<Extra> extras) {
        this.food = food;
        this.drink = drink;
        this.extras = extras;
    }

    @Override
    protected MealShallow clone() {
        return new MealShallow(food, drink, extras);
    }

    public void addExtra(String name) {
        extras.add(new Extra(name));
    }

    public void showMeal() {
        System.out.print(food + " | " + drink + " | extras: ");
        for (Extra e : extras) {
            System.out.print(e.name + " ");
        }
        System.out.println();
    }
}
