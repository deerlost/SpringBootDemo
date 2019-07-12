package com.makotojava.learn.springboot.model;


/**
 * @Description TODO
 * @ClassName：SpiderMan :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2019/7/9
 * @版本：V1.0
 */
public class SpiderMan extends Person{

    private String location;


    public SpiderMan(String name, Integer age,String location) {
        super(name, age);
        this.location=location;
    }

    public void testName(){
        System.out.println(super.getName());
    }

    public String getLocation() {
        return location;
    }

    public SpiderMan setLocation(String location) {
        this.location = location;
        return this;
    }
}
