package cn.newbeedaly.design.pattern.behavioral.mediator;

/**
 * 中介者模式 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 *
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Test {

    public static void main(String[] args) {
        User newbeedaly = new User("newbeedaly");
        User jack = new User("jack");
        newbeedaly.sendMessage("hello");
        jack.sendMessage("hello bro");
    }

}

