package com.codestates.section2week3.discount;

import com.codestates.section2week3.user.User;

public interface DiscountInfo {
    int discount(User user, int price);
}
