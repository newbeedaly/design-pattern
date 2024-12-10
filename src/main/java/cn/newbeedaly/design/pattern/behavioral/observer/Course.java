package cn.newbeedaly.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "--在" + course.getCourseName() + "--提问--");
        setChanged();
        notifyObservers(question);
    }
}
