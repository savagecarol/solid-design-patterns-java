package behaviourial.iinterpretor.good;

public class AndExpression implements Expression {

    private Expression left; // pizza
    private Expression right; // burger

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret() {
        left.interpret();
        right.interpret();
    }
}
