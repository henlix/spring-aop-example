package org.sopt.spring.aop.race.impl;

import org.sopt.spring.aop.race.base.Race;

public class Protoss implements Race {

    @Override
    public void attack() {

        System.out.println("만물의 운명이 경각에 달했다.");
    }
}
