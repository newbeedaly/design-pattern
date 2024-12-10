package cn.newbeedaly.design.pattern.behavioral.strategy;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class PromotionActivity {

    private final PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}
