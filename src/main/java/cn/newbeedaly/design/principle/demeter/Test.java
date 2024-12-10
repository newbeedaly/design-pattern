package cn.newbeedaly.design.principle.demeter;

/**
 * 迪米特法则（最少知道原则） 一个对象应该对其他对象保存最少的了解。
 * 如：老板并不知道你的bug数量，他要找项目负责人问。优点：降低类与类之间的耦合。
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }

}
