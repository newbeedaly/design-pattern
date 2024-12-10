package cn.newbeedaly.design.pattern.structural.adapter.objectadapter;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
