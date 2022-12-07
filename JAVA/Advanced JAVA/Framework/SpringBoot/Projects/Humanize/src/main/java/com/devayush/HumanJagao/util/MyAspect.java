package com.devayush.HumanJagao.util;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {

    @Before("execution(* com.devayush.HumanJagao.util.PaymentServiceImpl.java.makePyament())")
    public String printBefore(){
        return "Payment started...";
    }
}
