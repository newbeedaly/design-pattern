package cn.newbeedaly.design.principle.singleresponsibility;

/**
 * 单一职责原则 一个类/接口/方法只负责一项职责。
 * 如：大雁用翅膀飞，鸵鸟用脚走路，不应将它们的行为写在同一方法中；这样简单整洁。
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Test {

    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.move("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.move("鸵鸟");
    }

}
