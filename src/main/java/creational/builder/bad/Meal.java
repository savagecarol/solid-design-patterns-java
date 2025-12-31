package creational.builder.bad;

public class Meal {

    private String food;
    private String drink;
    private boolean fries;
    private boolean extraCheese;

    public Meal(String food) {
        this(food, null, false, false);
    }

    public Meal(String food, String drink) {
        this(food, drink, false, false);
    }

    public Meal(String food, String drink, boolean fries) {
        this(food, drink, fries, false);
    }

    public Meal(String food, String drink, boolean fries, boolean extraCheese) {
        this.food = food;
        this.drink = drink;
        this.fries = fries;
        this.extraCheese = extraCheese;
    }

    public void showMeal() {
        System.out.println(food + " | " + drink + " | fries: " + fries + " | cheese: " + extraCheese);
    }
}