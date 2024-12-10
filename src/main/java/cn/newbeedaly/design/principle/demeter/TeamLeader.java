package cn.newbeedaly.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author newbeedaly
 * @date 2023-07-23
 */
public class TeamLeader {

    public void checkNumberOfBugs() {
        List<Bug> bugList = new ArrayList<Bug>();
        for (int i = 0; i < 20; i++) {
            bugList.add(new Bug());
        }
        System.out.println("bug数量是：" + bugList.size());
    }

}
