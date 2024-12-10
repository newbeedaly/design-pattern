package cn.newbeedaly.design.pattern.structural.decorator.v2;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }

}
