package cn.newbeedaly.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class VideoApproVer extends ApproVer {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approVer != null) {
                approVer.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频，不批准");
        }
    }

}
