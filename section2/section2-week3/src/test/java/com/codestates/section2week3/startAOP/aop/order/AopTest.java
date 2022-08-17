package com.codestates.section2week3.startAOP.aop.order;

import com.codestates.section2week3.startAOP.aop.order.aop.Aspect6;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

@Slf4j
@SpringBootTest
@Import(Aspect6.class)
//@Import({Aspect5.LogAspect.class, Aspect5.TxAspect.class})
public class AopTest {
    @Autowired
    com.codestates.section2week3.startAOP.aop.order.OrderService orderService;

    @Autowired
    com.codestates.section2week3.startAOP.aop.order.OrderRepository orderRepository;

    @Test
    void aopInfo() {
        log.info("isAopProxy, orderService={}", AopUtils.isAopProxy(orderService));
        log.info("isAopProxy, orderRepository={}", AopUtils.isAopProxy(orderRepository));
    }

    @Test
    void success() {
        orderService.orderItem("itemA");
    }
    @Test
    void exception() {
        assertThatThrownBy(() -> orderService.orderItem("ex")).isInstanceOf(IllegalStateException.class);
    }
}
