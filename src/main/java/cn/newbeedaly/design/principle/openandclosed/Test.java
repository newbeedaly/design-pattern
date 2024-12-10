package cn.newbeedaly.design.principle.openandclosed;

import java.math.BigDecimal;

/**
 * 开闭原则 对扩展开放，对修改关闭
 * 如：商品打折出售时，不修改原来逻辑，添加商品打折类扩展
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Test {

    public static void main(String[] args) {
        CardCouponDiscountGoods goods = new CardCouponDiscountGoods(BigDecimal.valueOf(100));
        System.out.println("商品原价格:" + goods.getPrice() + "元," + "商品折后价格:" + goods.getDiscountPrice() + "元");
    }

}
