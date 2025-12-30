package solid.liskovSubstitution.good;

public class Pizza implements Food,CookableFood{
    @Override
    public void prepare() {
        System.out.println("Pizza");
    }

    @Override
    public void getName() {
        System.out.println("I will serve Pizza please cook it");
    }
}
