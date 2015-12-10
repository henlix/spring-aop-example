package org.sopt.spring.aop.usage;

import org.sopt.spring.aop.race.base.Race;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Program {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/dependencies.xml");
        Race race;

        // 01. Aspect Injection via @Aspect
        race = context.getBean("protoss", Race.class);
        race.attack();

        // 02. Aspect Injection with POJO and XML
        race = context.getBean("hybrid", Race.class);
        race.attack();
    }
}