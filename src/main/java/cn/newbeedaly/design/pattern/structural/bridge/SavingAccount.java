package cn.newbeedaly.design.pattern.structural.bridge;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        //...
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }

}
