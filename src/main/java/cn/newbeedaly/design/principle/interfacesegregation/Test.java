package cn.newbeedaly.design.principle.interfacesegregation;

/**
 * 接口隔离原则：用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口。
 * 如：狗可以吃东西和游泳，不需要依赖飞翔的接口
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.swim();
    }

}
