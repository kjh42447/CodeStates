package com.codestates.section2week3.discount;

import com.codestates.section2week3.user.User;
import com.codestates.section2week3.user.UserGrade;

public class CurrentDiscountInfo implements DiscountInfo{
    private int grade_1_Amount = 500;
    private int grade_2_Amount = 1000;

    @Override
    public int discount(User user, int price) {
        if (user.getUserGrade() == UserGrade.GRADE_1) {
            return grade_1_Amount;
        }
        else if (user.getUserGrade() == UserGrade.GRADE_2) {
            return grade_2_Amount;
        }
        return 0;
    }
}
