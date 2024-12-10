package cn.newbeedaly.design.pattern.behavioral.interpreter;

/**
 * 解释器模式 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
 * 为了解释一种语言，而为语言创建的解释器
 *
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Test {

    public static void main(String[] args) {
        String newbeedalyInputStr = "6 100 11 + *";
        NewbeedalyExpressionParse expressionParse = new NewbeedalyExpressionParse();
        int result = expressionParse.parse(newbeedalyInputStr);
        System.out.println("运行结果为" + result);
    }

}
