package behaviourial.visitor.good;

public class PriceVisitor implements FoodVisitor {

    @Override
    public void visit(Pizza pizza) {
        System.out.println("Pizza price: $300");
    }

    @Override
    public void visit(Burger burger) {
        System.out.println("Burger price: $150");
    }
}
