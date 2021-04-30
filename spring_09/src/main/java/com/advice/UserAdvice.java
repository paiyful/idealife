package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class UserAdvice {
    public void before(){
        System.out.println("前置通知，在方法之前执行");
    }

    public void after(){
        System.out.println("最终通知，在目标方法运行之后调用（无论是否出现异常）");
    }

    public void afterreturning(){
        System.out.println("后置通知，目标方法运行之后调用 (如果出现异常不会调用)");
    }

    public void afterthrowing(){
        System.out.println("异常通知，出现异常调用");
    }
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around --> 环绕通知，方法调用之前执行");

        Object proceed = joinPoint.proceed();

        System.out.println("Around --> 环绕通知，方法调用之后执行");

        return proceed;
    }
}
