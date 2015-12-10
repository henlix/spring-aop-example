package org.sopt.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TerranAspect {

    @Pointcut("execution(public void org.sopt.spring.aop.race.impl.Terran.attack())")
    private void terranPointcut() {}


    @Before("terranPointcut()")
    public void before(JoinPoint point) {

        System.out.println("[테란 - 제임스 유진 레이너]");
        System.out.println("안녕하신가, 친구들. 나는 짐 레이너, 이 지역 보안관이지.");
    }

    @After("terranPointcut()")
    public void after(JoinPoint point) {

        System.out.println("게임은 끝나봐야 아는 거야. 이 자식아.\n");
    }
}
