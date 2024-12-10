package cn.newbeedaly.design.pattern.structural.decorator.v1;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }

}
