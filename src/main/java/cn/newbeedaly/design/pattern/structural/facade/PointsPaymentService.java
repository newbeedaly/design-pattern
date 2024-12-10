package cn.newbeedaly.design.pattern.structural.facade;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }

}
