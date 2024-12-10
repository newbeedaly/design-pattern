package cn.newbeedaly.design.pattern.behavioral.visitor;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Visitor implements IVisistor {

    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + ",价格：" + codingCourse.getPrice());
    }
}
