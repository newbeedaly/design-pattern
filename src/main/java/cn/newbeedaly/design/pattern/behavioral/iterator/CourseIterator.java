package cn.newbeedaly.design.pattern.behavioral.iterator;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public interface CourseIterator {

    Course nextCourse();
    boolean isLastCourse();

}
