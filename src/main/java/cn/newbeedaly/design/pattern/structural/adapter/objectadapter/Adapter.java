package cn.newbeedaly.design.pattern.structural.adapter.objectadapter;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
