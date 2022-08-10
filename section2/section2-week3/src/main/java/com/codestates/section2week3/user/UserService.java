package com.codestates.section2week3.user;

public interface UserService {
    void signup(User user);
    User findUser(Long userId);
}
