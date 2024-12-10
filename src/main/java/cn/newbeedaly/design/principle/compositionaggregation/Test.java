package cn.newbeedaly.design.principle.compositionaggregation;

/**
 * 合成/复用原则 它要求在软件复用时，要尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。
 *
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Test {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }

}
