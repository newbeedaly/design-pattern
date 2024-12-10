package cn.newbeedaly.design.pattern.structural.adapter.objectadapter;

/**
 * 适配器模式
 * 将一个类的接口转换成客户期望的另一个接口，使原本接口不兼容的类可以一起工作
 *
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }

}
