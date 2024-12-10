package cn.newbeedaly.design.pattern.structural.proxy;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class OrderDaoImpl implements IOrderDao {

    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
