package behaviourial.visitor.good;

public class CookingTimeVisitor implements FoodVisitor {

    @Override
    public void visit(Pizza pizza) {
        System.out.println("Pizza cooking time: 15 minutes");
    }

    @Override
    public void visit(Burger burger) {
        System.out.println("Burger cooking time: 10 minutes");
    }
}
