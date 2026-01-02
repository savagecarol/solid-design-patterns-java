package behaviourial.iinterpretor.good;

public class BurgerExpression implements Expression {

    @Override
    public void interpret() {
        System.out.println("Preparing Burger");
    }
}
