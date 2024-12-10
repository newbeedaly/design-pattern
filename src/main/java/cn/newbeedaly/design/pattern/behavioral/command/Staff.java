package cn.newbeedaly.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author newbeedaly
 * @date 2023-07-05
 */
public class Staff {

    private List<Command> commandList = new ArrayList<>();


    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
