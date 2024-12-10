package cn.newbeedaly.design.pattern.reational.abstractfactory;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }

}
