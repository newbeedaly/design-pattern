package cn.newbeedaly.design.pattern.behavioral.strategy;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class ManJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }

}
