package creational.prototype.bad;

public class Meal {

    private String food;
    private String drink;
    private boolean extraCheese;

    public Meal(String food, String drink, boolean extraCheese) {
        this.food = food;
        this.drink = drink;
        this.extraCheese = extraCheese;
    }

    public void showMeal() {
        System.out.println(food + " | " + drink + " | extra cheese: " + extraCheese);
    }
}
