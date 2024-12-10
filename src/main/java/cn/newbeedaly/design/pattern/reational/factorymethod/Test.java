package cn.newbeedaly.design.pattern.reational.factorymethod;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

}
