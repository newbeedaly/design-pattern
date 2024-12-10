package cn.newbeedaly.design.pattern.reational.abstractfactory;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }

}
