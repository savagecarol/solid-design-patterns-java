package creational.builder.good;

public class Burger implements Food {

    private boolean extraCheese;

    public Burger(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public String getName() {
        return extraCheese ? "Burger with extra cheese" : "Burger";
    }
}
