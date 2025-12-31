package creational.builder.good;

public class Meal {

    private String food;
    private String drink;
    private boolean fries;
    private boolean extraCheese;

    private Meal(Builder builder) {
        this.food = builder.food;
        this.drink = builder.drink;
        this.fries = builder.fries;
        this.extraCheese = builder.extraCheese;
    }

    public void showMeal() {
        System.out.println(food + " | " + drink + " | fries: " + fries + " | cheese: " + extraCheese);
    }

    /**  static inner Builder class
     * we add everything to builder object -> and then finally pass it to parent
     * here we will make everything in builder and then pass it -> Meal (Parent)
     */
    public static class Builder {

        private String food;
        private String drink;
        private boolean fries;
        private boolean extraCheese;

        public Builder food(String food) {
            this.food = food;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder fries(boolean fries) {
            this.fries = fries;
            return this;
        }

        public Builder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}
