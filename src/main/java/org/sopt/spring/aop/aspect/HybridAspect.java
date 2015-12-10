package org.sopt.spring.aop.aspect;

public class HybridAspect {

    public void before() {

        System.out.println("[혼종 - 아몬 : 어두운 목소리]");
        System.out.println("나는 너희의 시작이었으니 ... 또한, 끝이리라.");
    }

    public void after() {

        System.out.println("이 육체와 프로토스는 모두 나의 것이다. 난 이 망가진 순환을 끊겠다! 너는 날 막지 못하리라.\n");
    }
}
