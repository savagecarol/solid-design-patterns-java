package solid.openClosedPrinciple.good;

public class Nachos implements Food{
    @Override
    public void prepare() {
        System.out.println("Nachos");
    }
}
