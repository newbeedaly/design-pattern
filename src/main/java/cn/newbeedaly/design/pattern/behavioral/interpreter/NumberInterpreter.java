package cn.newbeedaly.design.pattern.behavioral.interpreter;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpreter() {
        return this.number;
    }
}
