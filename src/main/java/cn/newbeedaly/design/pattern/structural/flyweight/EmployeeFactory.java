package cn.newbeedaly.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author newbeedaly
 * @date 2023-07-04
 */
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建部门经理:" + department);
            String reportContent = department + "部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }

}
