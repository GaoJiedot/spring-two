package com.gj.testaop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


import java.util.Date;
@Aspect
public class RecodeAspect {
    @Pointcut("execution(* com.gj.testaop.Recode.*(..))")
    public void recode(){

    }
    @Around("recode()")
    public  Object recodeTime(ProceedingJoinPoint thisingJoinPoint)throws Throwable{
        String className = thisingJoinPoint.getTarget().getClass().getName();
        String methodName = thisingJoinPoint.getSignature().getName();
        long startTime=System.currentTimeMillis();
        Object result = thisingJoinPoint.proceed();
        long time= System.currentTimeMillis()- startTime;
        Recode recode = new Recode();
        recode.setExpendTime(time);
        recode.setRecodeTime(new Date());
        recode.setClassName(className);
        System.out.println(recode.toString());
        return result;
    }
}
