package org.sopt.spring.aop.race.impl;

import org.sopt.spring.aop.race.base.Race;

public class Hybrid implements Race {

    @Override
    public void attack() {

        System.out.println("저항은 무의미하다. 나의 사도들이 새 시대를 열 것이다.");
    }
}
