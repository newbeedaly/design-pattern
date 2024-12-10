package cn.newbeedaly.design.principle.dependenceinversion;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Newbeedaly {

    private ICourse iCourse;

    public void addCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }

}
