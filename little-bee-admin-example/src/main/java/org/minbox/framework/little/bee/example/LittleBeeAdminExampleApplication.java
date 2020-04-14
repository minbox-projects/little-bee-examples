package org.minbox.framework.little.bee.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Little Bee Admin Example
 *
 * @author 恒宇少年
 */
@SpringBootApplication
public class LittleBeeAdminExampleApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(LittleBeeAdminExampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LittleBeeAdminExampleApplication.class, args);
        logger.info("服务启动成功.");
    }
}
