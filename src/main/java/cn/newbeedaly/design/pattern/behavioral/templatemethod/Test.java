package cn.newbeedaly.design.pattern.behavioral.templatemethod;

/**
 * 模板方法 定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
 *
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");
    }

}
