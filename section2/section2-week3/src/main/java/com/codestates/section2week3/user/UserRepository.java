package com.codestates.section2week3.user;

public interface UserRepository {
    void saveUser(User user);
    User findByUserId(Long userId);
}
