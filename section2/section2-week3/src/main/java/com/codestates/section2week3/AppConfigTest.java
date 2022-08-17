package com.codestates.section2week3;

import com.codestates.section2week3.user.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = ac.getBean(UserService.class);

        System.out.println(UserService.class.isInstance(userService));
    }
}
