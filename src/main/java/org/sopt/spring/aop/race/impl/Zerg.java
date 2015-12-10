package org.sopt.spring.aop.race.impl;

import org.sopt.spring.aop.race.base.Race;

public class Zerg implements Race {

    @Override
    public void attack() {

        System.out.println("군대는 초토화되고, 세계는 불타리라.");
    }
}
