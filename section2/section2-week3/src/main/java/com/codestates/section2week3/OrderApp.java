package com.codestates.section2week3;

import com.codestates.section2week3.order.Order;
import com.codestates.section2week3.order.OrderService;
import com.codestates.section2week3.user.User;
import com.codestates.section2week3.user.UserGrade;
import com.codestates.section2week3.user.UserService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = ac.getBean("userService", UserService.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        Long userId = 0L;
        User user = new User(userId, "kimlucky", UserGrade.GRADE_1);
        userService.signup(user);

        Order order = orderService.createOrder(userId, "coffee", 5000);

        System.out.println("order = " + order);
    }
}
