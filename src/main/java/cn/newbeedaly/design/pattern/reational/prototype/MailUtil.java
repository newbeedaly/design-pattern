package cn.newbeedaly.design.pattern.reational.prototype;

import java.text.MessageFormat;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学, 邮件地址:{1}, 邮件内容:{2} 发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录, originMail: " + mail.getContent());
    }
}
