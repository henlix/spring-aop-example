package org.sopt.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProtossAspect {

    @Pointcut("execution(public void org.sopt.spring.aop.race.impl.Protoss.attack())")
    private void protossPointcut() {}


    @Before("protossPointcut()")
    public void before(JoinPoint point) {

        System.out.println("[프로토스 - 제라툴]");
        System.out.println("엔 타로 테사다르.");
    }

    @After("protossPointcut()")
    public void after(JoinPoint point) {

        System.out.println("내 목숨을, 아이어에 ...\n");
    }
}
