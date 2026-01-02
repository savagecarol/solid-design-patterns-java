package solid.liskovSubstitution.bad;

// salad we dont have to prepare or cook we can just serve
public class Salad extends Food {
    public void prepare() {
        throw new RuntimeException("df");
    }
}
