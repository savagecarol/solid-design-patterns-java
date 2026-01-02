package solid.liskovSubstitution.bad;

// pizza is child class of food
public class Pizza extends Food{

    public void prepare() {
        System.out.println("Pizza");
    }
}
