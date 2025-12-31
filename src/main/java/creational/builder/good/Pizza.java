package creational.builder.good;

public class Pizza implements Food {

    private boolean extraCheese;

    public Pizza(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public String getName() {
        return extraCheese ? "Pizza with extra cheese" : "Pizza";
    }
}
