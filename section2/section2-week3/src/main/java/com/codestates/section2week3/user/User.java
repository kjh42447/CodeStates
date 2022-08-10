package com.codestates.section2week3.user;

public class User {
    private Long id;
    private String name;
    private UserGrade userGrade;

    public User(Long id, String name, UserGrade userGrade) {
        this.id = id;
        this.name = name;
        this.userGrade = userGrade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserGrade(UserGrade userGrade) {
        this.userGrade = userGrade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserGrade getUserGrade() {
        return userGrade;
    }
}
