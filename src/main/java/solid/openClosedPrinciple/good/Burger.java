package solid.openClosedPrinciple.good;


public class Burger implements Food {
    @Override
    public void prepare() {
        System.out.println("Burger");
    }
}
