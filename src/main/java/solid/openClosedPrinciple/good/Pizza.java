package solid.openClosedPrinciple.good;


public class Pizza implements Food {

    @Override
    public void prepare() {
        System.out.println("Pizza");
    }
}
