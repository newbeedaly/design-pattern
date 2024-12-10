package cn.newbeedaly.design.pattern.behavioral.visitor;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public interface IVisistor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);

}
