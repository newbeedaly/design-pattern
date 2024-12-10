package cn.newbeedaly.design.pattern.structural.proxy.staticproxy;

import cn.newbeedaly.design.pattern.structural.proxy.Order;

/**
 * 代理模式 为其他对象提供一种代理，以控制对这个对象的访问代理
 *
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }

}
