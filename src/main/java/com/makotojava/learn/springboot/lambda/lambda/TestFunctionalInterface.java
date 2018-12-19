package com.makotojava.learn.springboot.lambda.lambda;


import com.makotojava.learn.springboot.lambda.model.Person;

import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.lambda
 * @anthor：wyang
 * @date：2018/12/18
 * @版本：V1.0
 */
public class TestFunctionalInterface {


    public static void main(String[] args) {
       /* System.out.println("执行之前");
        enact(s -> System.out.println(s), "myLambda");
        System.out.println("执行");*/

        List<Person> guiltyPersons = Arrays.asList(
                new Person("Yixing",  25),
                new Person("Yanggui", 30),
                new Person("Chao", 29)
        );

        checkAndExecute(guiltyPersons, p -> p.getName().startsWith("Z"), p -> System.out.println(p.getName()));
    }


    public static void enact(MyLambdaInterface myLambda,String s){
        myLambda.doSomeShit(s);
    }

    @FunctionalInterface
    public interface MyLambdaInterface {
        void doSomeShit(String s);
    }

    @FunctionalInterface
    public interface NameChecker {
        boolean check(Person p);
    }

    @FunctionalInterface
    public interface Executor {
        void execute(Person p);
    }

    public static void checkAndExecute(List<Person> personList, NameChecker nameChecker, Executor executor) {

        for (Person person : personList) {
            if (nameChecker.check(person)) {
                executor.execute(person);
            }
        }
    }
}