package behaviourial.visitor.good;

public interface FoodItem {
    void accept(FoodVisitor visitor);
}
