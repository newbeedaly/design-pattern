package cn.newbeedaly.design.pattern.behavioral.mediator;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class User {

    public User(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
