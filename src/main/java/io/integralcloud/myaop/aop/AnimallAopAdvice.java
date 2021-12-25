package io.integralcloud.myaop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AnimallAopAdvice {

    @Around("@annotation(io.integralcloud.myaop.annotation.MyLoggerAnnotation)")
    public Object logAnimal(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();
        Object myPjp = proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        log.info(proceedingJoinPoint.getSignature().getName() + " method execution time is: " + (endTime - startTime) + " milliSeconds");

        return myPjp;
    }
}
