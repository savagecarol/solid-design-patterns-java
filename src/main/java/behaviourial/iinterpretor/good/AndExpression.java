package behaviourial.iinterpretor.good;

public class AndExpression implements Expression {

    private Expression left;
    private Expression right;

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
