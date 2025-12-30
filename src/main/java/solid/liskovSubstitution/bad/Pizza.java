package solid.liskovSubstitution.bad;

public class Pizza extends Food{

    public void prepare() {
        System.out.println("Pizza");
    }
}
