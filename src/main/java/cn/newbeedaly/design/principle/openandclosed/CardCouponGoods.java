package cn.newbeedaly.design.principle.openandclosed;

import java.math.BigDecimal;

/**
 * 卡券商品
 * @author newbeedaly
 * @date 2023-07-23
 */
public class CardCouponGoods implements IGoods {

    public BigDecimal price;

    public CardCouponGoods(BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
