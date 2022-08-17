package com.codestates.section2week3.startAOP.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(* com.codestates.section2week3.startAOP.aop.order..*(..))")
    public void allOrder(){};

    @Pointcut("execution(* *..*Service.*(..))")
    public void allService(){};

    @Pointcut("allOrder() && allService()")
    public void orderAndService(){};
}
