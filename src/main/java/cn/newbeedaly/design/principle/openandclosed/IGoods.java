package cn.newbeedaly.design.principle.openandclosed;


import java.math.BigDecimal;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public interface IGoods {
    /**
     * 查询商品价格
     *
     * @return 课程ID
     */
    BigDecimal getPrice();

}
