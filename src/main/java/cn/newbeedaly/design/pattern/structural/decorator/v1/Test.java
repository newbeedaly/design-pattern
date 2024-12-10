package cn.newbeedaly.design.pattern.structural.decorator.v1;

/**
 * 装饰者模式 在不改变原有对象的基础之上，将功能附加到对象上。
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Test {

    public static void main(String[] args) {

        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" 价格为:"+battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 价格为:"+battercakeWithEgg.cost());


        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+" 价格为:"+battercakeWithEggSausage.cost());

    }

}
