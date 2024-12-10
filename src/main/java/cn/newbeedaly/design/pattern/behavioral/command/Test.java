package cn.newbeedaly.design.pattern.behavioral.command;

/**
 * 命令模式 将“请求”封装成对象，以便使用不同的请求
 * 命令模式解决了应用程序中对象的职责以及它们之间的通信方式,发送者与接收者完全解耦。
 *
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java设计模式");

        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);
        staff.executeCommands();
    }
}
