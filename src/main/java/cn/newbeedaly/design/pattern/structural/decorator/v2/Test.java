package cn.newbeedaly.design.pattern.structural.decorator.v2;

/**
 * 装饰者模式 在不改变原有对象的基础之上，将功能附加到对象上。
 *
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " 价格为:" + aBattercake.cost());
    }

}
