package cn.newbeedaly.design.pattern.reational.prototype.abstractprototype;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public abstract class A implements Cloneable {

    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
