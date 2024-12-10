package cn.newbeedaly.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] " + message);
    }

}
