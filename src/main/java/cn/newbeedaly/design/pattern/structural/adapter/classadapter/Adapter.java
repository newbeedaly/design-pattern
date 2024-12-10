package cn.newbeedaly.design.pattern.structural.adapter.classadapter;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
