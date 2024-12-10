package cn.newbeedaly.design.pattern.reational.simplefactory;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }

}
