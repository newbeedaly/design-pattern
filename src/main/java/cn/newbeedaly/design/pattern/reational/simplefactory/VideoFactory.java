package cn.newbeedaly.design.pattern.reational.simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class VideoFactory {

    /**
     * 第二种方式
     * @param c class类
     * @return video类
     */
    public Video getVideo(Class<?> c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return video;
    }


    /**
     * 第一种方式
     * @param type 类型参数
     * @return video类
     */
    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}
