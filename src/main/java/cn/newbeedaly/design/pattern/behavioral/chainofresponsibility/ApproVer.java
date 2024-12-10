package cn.newbeedaly.design.pattern.behavioral.chainofresponsibility;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public abstract class ApproVer {

    /**
     * 包含自己同样类型的对象
     */
    protected ApproVer approVer;

    public void setNextApproVer(ApproVer approVer) {
        this.approVer = approVer;
    }

    public abstract void deploy(Course course);
}
