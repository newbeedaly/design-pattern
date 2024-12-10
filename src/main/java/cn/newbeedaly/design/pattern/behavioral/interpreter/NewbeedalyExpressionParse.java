package cn.newbeedaly.design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class NewbeedalyExpressionParse {

    private final Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈：" + numberExpression.interpreter()));
            } else {
                // 运算符合计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d", firstExpression.interpreter(), secondExpression.interpreter()));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符：%s", operator));
                int result = operator.interpreter();
                NumberInterpreter resultInterpreter = new NumberInterpreter(result);
                stack.push(resultInterpreter);
                System.out.println(String.format("阶段结果入栈：%s", resultInterpreter.interpreter()));

            }
        }
        int result = stack.pop().interpreter();
        System.out.println("返回结果：" + result);
        return result;
    }
}
