package cn.newbeedaly.design.pattern.structural.bridge;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
