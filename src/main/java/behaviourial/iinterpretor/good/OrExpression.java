package behaviourial.iinterpretor.good;

import java.util.Random;

public class OrExpression implements Expression {

    private Expression left;
    private Expression right;

    public OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret() {
        System.out.println("Choose one:");
        if(System.nanoTime()/2 == 0) {
            right.interpret();
        }
        else left.interpret();
    }
}
