package org.sopt.spring.aop.race.impl;

import org.sopt.spring.aop.race.base.Race;

public class Terran implements Race {

    @Override
    public void attack() {

        System.out.println("가서 쓸어버려.");
    }
}
