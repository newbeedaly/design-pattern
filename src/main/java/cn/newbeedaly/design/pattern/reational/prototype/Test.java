package cn.newbeedaly.design.pattern.reational.prototype;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("模板内容");
        for (int i = 0; i < 10; i++) {
            Mail mailTemplate = (Mail) mail.clone();
            mailTemplate.setName("姓名" + i);
            mailTemplate.setEmailAddress("姓名" + i + "@imooc.com");
            mailTemplate.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemplate);
            System.out.println("克隆的mailTemplate:" + mailTemplate);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
