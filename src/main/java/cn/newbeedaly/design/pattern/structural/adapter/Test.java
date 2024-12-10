package cn.newbeedaly.design.pattern.structural.adapter;

/**
 * 适配器模式
 * 将一个类的接口转换成客户期望的另一个接口，使原本接口不兼容的类可以一起工作
 *
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }

}
