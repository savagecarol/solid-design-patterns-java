package behaviourial.iinterpretor.good;

public class CokeExpression implements Expression {

    @Override
    public void interpret() {
        System.out.println("Serving Coke");
    }
}
