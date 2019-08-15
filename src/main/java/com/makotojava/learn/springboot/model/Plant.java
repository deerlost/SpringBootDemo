package com.makotojava.learn.springboot.model;


import java.util.Set;

/**
 * @Description TODO
 * @ClassName：Plant :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2019/8/15
 * @版本：V1.0
 */
public class Plant {
    enum LifeCycle{ANNUAL,PERENNIAL,BIENNIAL}

    final String name;
    final LifeCycle lifeCycle;

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

}
