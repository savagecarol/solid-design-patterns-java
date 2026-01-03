package creational.prototype.good;

import java.util.ArrayList;
import java.util.List;

public class MealDeepCopy implements Cloneable {

    private String food;
    private String drink;
    private List<Extra> extras;

    public MealDeepCopy(String food, String drink, List<Extra> extras) {
        this.food = food;
        this.drink = drink;
        this.extras = extras;
    }

    @Override
    protected MealDeepCopy clone() {
        List<Extra> extrasCopy = new ArrayList<>();
        for (Extra e : extras) {
            extrasCopy.add(new Extra(e.name));
        }
        return new MealDeepCopy(food, drink, extrasCopy); // deep copy
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
