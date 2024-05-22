package com.gj.tsetaop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import java.util.Date;
@Aspect
public class MessageAspect {
    @Pointcut("execution(* com.gj.tsetaop2.Service*.*(..))")
    public void exceptionMsg(){
    }
    @Around("exceptionMsg()")
    public  Object msgMethod(ProceedingJoinPoint thisJoinPoint)throws Throwable {
        String clazzName = thisJoinPoint.getTarget().getClass().getName();
        String methodName = thisJoinPoint.getSignature().getName();
        try {
            return thisJoinPoint.proceed();

        } catch (MyException e) {
            Message msg = new Message();
            msg.getClassName(thisJoinPoint.getTarget().getClass().getName());
            msg.getMethodName(thisJoinPoint.getSignature().getName());
            msg.setRecodeTime(new Date());
            msg.setExpendTionMsg(e.getMsg());
            System.out.println(msg.toString());
            return null;
        }
    }
}
