package cn.newbeedaly.design.pattern.behavioral.observer;

/**
 * 观察者模式 定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，
 *  当主题对象发生变化时，它的所有依赖者（观察者）都会收到通知并更新
 *
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Test {

    public static void main(String[] args) {

        Course course = new Course("java设计模式");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        // 业务逻辑代码
        Question question = new Question();
        question.setContent("java主函数如何编写");
        question.setUserName("newbeedaly");

        course.produceQuestion(course, question);
    }
}
