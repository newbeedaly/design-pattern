package cn.newbeedaly.design.principle.dependenceinversion;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("newbeedaly在学习Java课程");
    }

}
