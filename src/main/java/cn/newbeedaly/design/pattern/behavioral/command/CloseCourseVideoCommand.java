package cn.newbeedaly.design.pattern.behavioral.command;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }

}
