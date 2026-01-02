package behaviourial.visitor.good;

public class CaloriesVisitor implements FoodVisitor {

    @Override
    public void visit(Pizza pizza) {
        System.out.println("Pizza calories: 800 kcal");
    }

    @Override
    public void visit(Burger burger) {
        System.out.println("Burger calories: 500 kcal");
    }
}
