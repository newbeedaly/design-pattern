package cn.newbeedaly.design.pattern.behavioral.command;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
