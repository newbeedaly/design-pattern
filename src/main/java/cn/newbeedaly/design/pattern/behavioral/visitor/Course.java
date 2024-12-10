package cn.newbeedaly.design.pattern.behavioral.visitor;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisistor visistor);
}
