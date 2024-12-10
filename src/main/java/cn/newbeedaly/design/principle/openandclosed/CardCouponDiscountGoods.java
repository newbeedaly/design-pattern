package cn.newbeedaly.design.principle.openandclosed;

import java.math.BigDecimal;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class CardCouponDiscountGoods extends CardCouponGoods {

    public CardCouponDiscountGoods(BigDecimal price) {
        super(price);
    }

    public BigDecimal getDiscountPrice() {
        return super.getPrice().multiply(BigDecimal.valueOf(0.8));
    }

}
