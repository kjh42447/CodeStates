// 클래스 단위로 어드바이스 설정(순서 설정 가능)
package com.codestates.section2week3.startAOP.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.junit.jupiter.api.Order;

@Slf4j
@Aspect
public class Aspect5 {
    @Aspect
    @Order(2)
    public static class LogAspect {
        @Around("com.codestates.section2week3.startAOP.aop.order.aop.Pointcuts.allOrder()")
        public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
            log.info("log -> {}", joinPoint.getSignature());
            return joinPoint.proceed();
        }
    }

    @Aspect
    @Order(1)
    public static class TxAspect {
        @Around("com.codestates.section2week3.startAOP.aop.order.aop.Pointcuts.orderAndService()")
        public Object doTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
            try {
                log.info("트랜잭션 시작 -> {}", joinPoint.getSignature());
                Object result = joinPoint.proceed();
                log.info("트랜잭션 커밋 -> {}", joinPoint.getSignature());
                return result;
            } catch (Exception e) {
                log.info("트랜잭션 롤백 -> {}", joinPoint.getSignature());
                throw e;
            } finally {
                log.info("리소스 릴리즈 -> {}", joinPoint.getSignature());
            }
        }
    }
}
