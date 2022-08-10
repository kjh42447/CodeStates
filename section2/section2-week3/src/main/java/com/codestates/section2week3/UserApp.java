package com.codestates.section2week3;

import com.codestates.section2week3.user.User;
import com.codestates.section2week3.user.UserGrade;
import com.codestates.section2week3.user.UserService;
import com.codestates.section2week3.user.UserServiceImpl;

public class UserApp {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        User user = new User (0L, "kimcoding", UserGrade.GRADE_2);
        userService.signup(user);

        User currentUser = userService.findUser(0L);
        System.out.println("signup user : " + user.getName());
        System.out.println("current user : " + currentUser.getName());

        if (user.getName().equals((currentUser.getName()))) {
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }
    }
}
