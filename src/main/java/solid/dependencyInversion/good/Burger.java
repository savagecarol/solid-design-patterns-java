package solid.dependencyInversion.good;

public class Burger implements Food {

    @Override
    public void prepare() {
        System.out.println("Preparing Burger");
    }
}
