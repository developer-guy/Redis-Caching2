package org.redis;

import org.redis.domain.User;
import org.redis.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bapaydin on 10.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:appConfig.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = new User("1","BAtuhan");

        User user1 = userService.saveUser(user);
        System.out.println(user1.getId() + " saved.");
    }
}
