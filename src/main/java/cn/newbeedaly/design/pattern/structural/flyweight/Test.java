package cn.newbeedaly.design.pattern.structural.flyweight;

/**
 * 享元模式 提供了减少对象数量从而改善应用所需的对象结构的方式
 *
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Test {

    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }

}
