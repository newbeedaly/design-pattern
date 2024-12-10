package cn.newbeedaly.design.pattern.behavioral.templatemethod;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class DesignPatternCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}
