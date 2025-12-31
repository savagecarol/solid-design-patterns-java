package creational.builder.good;

/**
 * Pattern that is helpful in creating complex object
 *
 *  Story -> customer wants to order meal and meal is very big class like contains
 *  [food,drink,fries,extraCheese]
 *  -> maybe customer wants to take something and maybe not like want to
 *  like cheese/no-cheese
 *  fries - no fries
 *
 *
 * Without Builder, constructor becomes confusing.
 * With Builder, object is built step by step in readable way.
 *
 * lombok - @Builder annotation
 */
public class Restaurant {

    public static void main(String[] args) {
        System.out.println("Customer builds meal");

        Meal meal1 = new Meal.Builder()
                .food("Pizza")
                .drink("Coke")
                .fries(true)
                .extraCheese(true)
                .build();
        meal1.showMeal();

        Meal meal2 = new Meal.Builder()
                .food("Pizza")
                .drink("Coke")
                .extraCheese(true)
                .build();
        meal2.showMeal();


        ComplexMeal meal3 = new ComplexMeal.Builder()
                .pizza(true)   // Pizza with extra cheese
                .coke()        // Drink
                .build();
        meal3.showMeal();
    }

}
