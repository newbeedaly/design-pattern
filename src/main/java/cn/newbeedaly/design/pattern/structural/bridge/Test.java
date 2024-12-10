package cn.newbeedaly.design.pattern.structural.bridge;

/**
 * 桥接模式
 *
 * 将抽象部分与它的具体实现部分分离，使它们都可以独立地变化
 * 通过组合的方式建立两个类之间联系，而不是继承
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
