package cn.newbeedaly.design.pattern.structural.bridge;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
