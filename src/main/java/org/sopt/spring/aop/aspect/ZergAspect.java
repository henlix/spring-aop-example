package org.sopt.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ZergAspect {

    @Pointcut("execution(public void org.sopt.spring.aop.race.impl.Zerg.attack())")
    public void zergPointcut() {}


    @Before("zergPointcut()")
    public void before(JoinPoint point) {

        System.out.println("[저그 - 사라 루이스 케리건]");
        System.out.println("나는 군단이다.");
    }

    @After("zergPointcut()")
    public void after(JoinPoint point) {

        System.out.println("내가 바로 칼날 여왕이다.\n");
    }
}
