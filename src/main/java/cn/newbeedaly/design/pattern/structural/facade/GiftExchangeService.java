package cn.newbeedaly.design.pattern.structural.facade;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class GiftExchangeService {

    private final QualifyService qualifyService = new QualifyService();
    private final PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private final ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            // 资格校验通过
            if (pointsPaymentService.pay(pointsGift)) {
                // 如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:" + shippingOrderNo);
            }
        }
    }

}
