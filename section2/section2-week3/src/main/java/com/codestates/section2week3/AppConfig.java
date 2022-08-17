package com.codestates.section2week3;

import com.codestates.section2week3.discount.CurrentDiscountInfo;
import com.codestates.section2week3.discount.DiscountInfo;
import com.codestates.section2week3.order.OrderService;
import com.codestates.section2week3.order.OrderServiceImpl;
import com.codestates.section2week3.user.UserRepository;
import com.codestates.section2week3.user.UserRepositoryImpl;
import com.codestates.section2week3.user.UserService;
import com.codestates.section2week3.user.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //구성정보 담당 선언
@ComponentScan
public class AppConfig {
//    @Autowired로 자동으로 생성해줄 내용
//    @Bean
//    public UserService userService() {
//        return new UserServiceImpl(new UserRepositoryImpl());
//    }
//
//    @Bean
//    public UserRepository userRepository() {
//        return new UserRepositoryImpl();
//    }
//
//    @Bean
//    public OrderService orderService() {
//        return new OrderServiceImpl(new UserRepositoryImpl(), new CurrentDiscountInfo());
//    }
//
//    @Bean
//    public DiscountInfo discountInfo() {
//        return new CurrentDiscountInfo();
//    }
}
