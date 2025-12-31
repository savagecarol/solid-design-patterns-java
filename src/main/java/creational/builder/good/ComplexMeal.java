package creational.builder.good;

public class ComplexMeal {

    private Food food;
    private Drink drink;

    private ComplexMeal(Builder builder) {
        this.food = builder.food;
        this.drink = builder.drink;
    }

    public void showMeal() {
        System.out.println("Meal includes:");
        System.out.println("- " + food.getName());
        System.out.println("- " + drink.getName());
    }

    public static class Builder {

        private Food food;
        private Drink drink;

        public Builder pizza(boolean extraCheese) {
            this.food = new Pizza(extraCheese);
            return this;
        }

        public Builder burger(boolean extraCheese) {
            this.food = new Burger(extraCheese);
            return this;
        }

        public Builder coke() {
            this.drink = new Coke();
            return this;
        }

        public ComplexMeal build() {
            return new ComplexMeal(this);
        }
    }
}
