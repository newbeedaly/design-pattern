package cn.newbeedaly.design.pattern.structural.bridge;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public abstract class Bank {

    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
