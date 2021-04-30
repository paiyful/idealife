package com.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class UserServiceAspect {
    //切点
    @Pointcut("execution(* com.service.impl.UserServiceImpl.*())")
    public static  void pointCut(){}


    //前置通知
    @Before("pointCut()")
    public void before(){
        System.out.println("前置通知");
    }


    //后置通知
    @After("pointCut()")
    public void after(){
        System.out.println("后置通知，怎样都通知");
    }

    //异常后置通知
    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("异常通知，只有通常才会通知");
    }



    //调用后置通知
    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("调用后置通知，调用才会通知，异常不通知");
    }


    //环绕通知
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("环绕前");
    Object proceed=null;
        try {
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后");
        return proceed;
    }



}
