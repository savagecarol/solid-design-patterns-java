package structural.decorator.good;

public class Pizza implements Food {

    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String description() {
        return "Plain Pizza";
    }
}
