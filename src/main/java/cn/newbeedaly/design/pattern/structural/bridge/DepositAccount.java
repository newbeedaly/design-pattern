package cn.newbeedaly.design.pattern.structural.bridge;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class DepositAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
