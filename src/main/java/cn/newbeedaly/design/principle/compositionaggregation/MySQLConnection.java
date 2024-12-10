package cn.newbeedaly.design.principle.compositionaggregation;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }

}
