package cn.newbeedaly.design.pattern.reational.prototype.abstractprototype;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class B extends A {

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.setA("a");
        Object cloneB = b.clone();
        System.exit(0);
    }

}
