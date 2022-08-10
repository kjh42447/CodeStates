package com.codestates.section2week3.order;

public interface OrderService {
    Order createOrder(Long userId, String itemName, int itemPrice);
}
