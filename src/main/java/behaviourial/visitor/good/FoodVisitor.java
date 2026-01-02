package behaviourial.visitor.good;

public interface FoodVisitor {
    void visit(Pizza pizza);
    void visit(Burger burger);
}
