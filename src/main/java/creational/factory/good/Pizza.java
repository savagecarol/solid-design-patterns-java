package creational.factory.good;

public class Pizza implements Food {

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza");
    }
}
