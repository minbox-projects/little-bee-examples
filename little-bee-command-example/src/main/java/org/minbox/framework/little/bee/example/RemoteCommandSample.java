package org.minbox.framework.little.bee.example;

import org.minbox.framework.little.bee.core.authenticate.Authenticate;
import org.minbox.framework.little.bee.core.authenticate.AuthenticateDefaultSupport;
import org.minbox.framework.little.bee.core.command.MavenPackageCommand;
import org.minbox.framework.little.bee.core.command.response.CommandResponse;

/**
 * 远程命令执行示例
 *
 * @author 恒宇少年
 */
public class RemoteCommandSample {
    public static void main(String[] args) {
        Authenticate authenticate = new AuthenticateDefaultSupport("root", "iot-node1");
        MavenPackageCommand packageCommand = new MavenPackageCommand();
        packageCommand.setExecutionDirectory("/home/source/iot-server-projects");
        packageCommand.setAuthenticate(authenticate);
        CommandResponse response = packageCommand.execute();
        System.out.println(response.getNonBlocking().getLogFilePath());
    }
}
