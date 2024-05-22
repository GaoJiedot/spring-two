package com.gj.aspect;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class XmlAdvice {
    @Pointcut("execution(* com.gj.dao.Impl.UserDaoImpl.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("1.这是前置通知");
        System.out.println("目标类是"+joinPoint.getTarget());
        System.out.println("貝织入增强处理的目标方法为"+joinPoint.getStaticPart());
    }
   @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("2.这是返回通知（方法不出异常时才会调用");
        System.out.println("貝织入增强处理的目标方法为"+joinPoint.getStaticPart());
    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("3.这是环绕之前执行的代码");
        Object object = point.proceed();
        System.out.println("3.这是环绕之后执行的代码");

        return object;
    }
    @AfterThrowing("pointcut()")
    public void afterException(){
        System.out.println("4.异常通知");
    }
    @After("pointcut()")
    public void after(){
        System.out.println("5.只是后置通知");
    }
}
