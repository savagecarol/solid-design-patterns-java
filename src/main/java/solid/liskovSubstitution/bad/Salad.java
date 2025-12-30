package solid.liskovSubstitution.bad;

public class Salad extends Food {
    public void prepare() {
        throw new RuntimeException("df");
    }
}
