package behaviourial.visitor.good;

public class Burger implements FoodItem {

    @Override
    public void accept(FoodVisitor visitor) {
        visitor.visit(this);
    }
}
