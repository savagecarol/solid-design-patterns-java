package creational.factory.good;

public class Pizza implements Food {
    String flour = "flour";
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza with" + flour);
    }
}
