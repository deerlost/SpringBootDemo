package com.makotojava.learn.springboot.model;



/**
 * @Description TODO
 * @ClassName： :
 * @Package test.model
 * @anthor：wyang
 * @date：2018/12/17
 * @版本：V1.0
 */
public class Person {
    private String name;

    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}