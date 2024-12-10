package cn.newbeedaly.design.pattern.behavioral.strategy;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class LiJianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }

}
