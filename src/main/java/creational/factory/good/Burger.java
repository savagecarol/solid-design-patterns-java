package creational.factory.good;

public class Burger implements Food {
    String bread = "bread";

    @Override
    public void prepare() {
        System.out.println("Preparing Burger with" + bread);
    }
}
