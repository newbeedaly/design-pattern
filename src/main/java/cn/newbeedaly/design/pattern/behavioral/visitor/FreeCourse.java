package cn.newbeedaly.design.pattern.behavioral.visitor;

/**
 * 免费课程
 * @author newbeedaly
 * @date 2023-07-05
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisistor visistor) {
        visistor.visit(this);
    }

}
