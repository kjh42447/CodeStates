package com.codestates.section2week3.order;

import com.codestates.section2week3.discount.CurrentDiscountInfo;
import com.codestates.section2week3.discount.DiscountInfo;
import com.codestates.section2week3.user.User;
import com.codestates.section2week3.user.UserRepository;
import com.codestates.section2week3.user.UserRepositoryImpl;

public class OrderServiceImpl implements OrderService{
//    private final UserRepository userRepository = new UserRepositoryImpl();
//    private final DiscountInfo discountInfo = new CurrentDiscountInfo();
    private final UserRepository userRepository;
    private final DiscountInfo discountInfo;

    public OrderServiceImpl(UserRepository userRepository, DiscountInfo discountInfo) {
        this.userRepository = userRepository;
        this.discountInfo = discountInfo;
    }

    @Override
    public Order createOrder(Long userId, String itemName, int itemPrice) {
        User user = userRepository.findByUserId(userId);
        int discountPrice = discountInfo.discount(user, itemPrice);

        return new Order(userId, itemName, itemPrice, discountPrice);
    }
}
