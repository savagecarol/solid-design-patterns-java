package solid.liskovSubstitution.good;

public class Salad implements Food{
    @Override
    public void getName() {
        System.out.println("I can serve Pizza no need to cook");
    }
}
