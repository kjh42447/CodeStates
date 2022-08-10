package com.codestates.section2week3;

import com.codestates.section2week3.discount.CurrentDiscountInfo;
import com.codestates.section2week3.discount.DiscountInfo;
import com.codestates.section2week3.order.OrderService;
import com.codestates.section2week3.order.OrderServiceImpl;
import com.codestates.section2week3.user.UserRepository;
import com.codestates.section2week3.user.UserRepositoryImpl;
import com.codestates.section2week3.user.UserService;
import com.codestates.section2week3.user.UserServiceImpl;

public class AppConfig {
    public UserService userService() {
        return new UserServiceImpl(new UserRepositoryImpl());
    }

    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new UserRepositoryImpl(), new CurrentDiscountInfo());
    }

    public DiscountInfo discountInfo() {
        return new CurrentDiscountInfo();
    }
}
