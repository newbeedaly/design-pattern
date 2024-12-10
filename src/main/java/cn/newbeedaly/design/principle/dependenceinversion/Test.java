package cn.newbeedaly.design.principle.dependenceinversion;

/**
 * 依赖倒置原则 依赖抽象而不依赖具体，高层模块不应该应该底层模块，二者都应该依赖其抽象
 * 如：将技术课程抽象，学习技术时只调用学习课程的抽象，而不调用具体的课程学习。
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Test {

    public static void main(String[] args) {
        Newbeedaly newbeedaly = new Newbeedaly();
        // 添加java课程进行学习
        newbeedaly.addCourse(new JavaCourse());
        newbeedaly.studyCourse();
        // 添加前端课程进行学习
        newbeedaly.addCourse(new FECourse());
        newbeedaly.studyCourse();
    }


}
