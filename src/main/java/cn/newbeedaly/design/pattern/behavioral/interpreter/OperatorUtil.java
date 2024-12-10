package cn.newbeedaly.design.pattern.behavioral.interpreter;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class OperatorUtil {

    public static boolean isOperator(String smbol) {
        return (smbol.equals("+") || smbol.equals("*"));
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if (symbol.equals("+")) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if (symbol.equals("*")) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }
}
