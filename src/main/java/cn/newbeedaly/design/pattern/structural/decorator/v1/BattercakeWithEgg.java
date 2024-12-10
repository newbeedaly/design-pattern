package cn.newbeedaly.design.pattern.structural.decorator.v1;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    public String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }

}
