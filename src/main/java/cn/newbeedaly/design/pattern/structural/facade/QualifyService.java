package cn.newbeedaly.design.pattern.structural.facade;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过,库存通过");
        return true;
    }

}
