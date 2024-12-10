package cn.newbeedaly.design.pattern.behavioral.interpreter;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class MultiInterpreter implements Interpreter {

    private final Interpreter firstExpression;
    private final Interpreter secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return this.firstExpression.interpreter() * this.secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "*";

    }
}
