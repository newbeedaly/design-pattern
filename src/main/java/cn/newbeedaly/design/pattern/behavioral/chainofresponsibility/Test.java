package cn.newbeedaly.design.pattern.behavioral.chainofresponsibility;

/**
 * 责任链模式 为请求创建一个接收此次请求对象的链
 *
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Test {

    public static void main(String[] args) {
        ApproVer articleApproVer = new ArticleApproVer();
        ApproVer videoApproVer = new VideoApproVer();

        Course course = new Course();
        course.setName("java设计模式");
        course.setArticle("java设计模式手记");
        course.setVideo("java设计模式视频");

        articleApproVer.setNextApproVer(videoApproVer);
        articleApproVer.deploy(course);
    }

}
