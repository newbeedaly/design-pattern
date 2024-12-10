package cn.newbeedaly.design.pattern.behavioral.strategy;

/**
 * 策略模式 定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的用户。
 * 可以消除if else
 *
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        promotionActivity618.executePromotionStrategy();

        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
        promotionActivity1111.executePromotionStrategy();
    }

}
