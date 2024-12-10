package cn.newbeedaly.design.pattern.reational.factorymethod;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class FEVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }

}
