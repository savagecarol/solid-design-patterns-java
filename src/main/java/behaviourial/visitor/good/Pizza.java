package behaviourial.visitor.good;

public class Pizza implements FoodItem {

    @Override
    public void accept(FoodVisitor visitor) {
        visitor.visit(this);
    }
}
