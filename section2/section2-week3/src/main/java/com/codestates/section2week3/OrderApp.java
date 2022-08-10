package com.codestates.section2week3;

import com.codestates.section2week3.order.Order;
import com.codestates.section2week3.order.OrderService;
import com.codestates.section2week3.user.User;
import com.codestates.section2week3.user.UserGrade;
import com.codestates.section2week3.user.UserService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        OrderService orderService = appConfig.orderService();

        Long userId = 0L;
        User user = new User(userId, "kimlucky", UserGrade.GRADE_1);
        userService.signup(user);

        Order order = orderService.createOrder(userId, "coffee", 5000);

        System.out.println("order = " + order);
    }
}
