package cn.newbeedaly.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的"
                + course.getCourseName() + "接收到" + question.getUserName()
                + "提交的一个问题:" + question.getContent());
    }
}
