package cn.newbeedaly.design.principle.demeter;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfBugs();
    }

}
