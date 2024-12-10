package cn.newbeedaly.design.pattern.structural.facade;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift){
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        return "666666";
    }

}
