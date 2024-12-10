package cn.newbeedaly.design.pattern.structural.facade;

/**
 * 门面模式（外观模式） 提供了一个统一的接口，用来访问子系统中的一群接口
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }

}
