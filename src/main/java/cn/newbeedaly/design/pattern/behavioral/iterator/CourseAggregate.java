package cn.newbeedaly.design.pattern.behavioral.iterator;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();

}
