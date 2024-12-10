package cn.newbeedaly.design.principle.dependenceinversion;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("newbeedaly在学习Python课程");
    }

}
