package cn.newbeedaly.design.principle.compositionaggregation;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class PostgreSQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }

}
