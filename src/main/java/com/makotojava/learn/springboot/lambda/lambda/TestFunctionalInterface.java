package com.makotojava.learn.springboot.lambda.lambda;


import com.makotojava.learn.springboot.model.Person;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<String> strList = list.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        List<Map<String, Object>> mapList = new ArrayList<>();

      /*  list.forEach(i -> {
            strList.stream().forEach(string -> map.put(string, i));
            mapList.add(map);
            mapList.forEach(key -> System.out.println(key));
        });*/

       /* for (Integer i : list) {
            strList.stream().forEach(string -> map.put(string, i));
            mapList.add(map);

            mapList.forEach(key -> System.out.println(key));

        }*/


        List<Person> guiltyPersons = Arrays.asList(
                new Person("Yixing", 25),
                new Person("Zanggui", 30),
                new Person("Chao", 29)
        );

        checkAndExecute(guiltyPersons, p -> p.getName().startsWith("A"), p -> System.out.println(p.getName()));

        list.forEach(i -> {
            strList.stream().forEach(
                    str -> {
                        if ((i == Integer.parseInt(str))) {
                            Map<String, Object> map = new HashMap<>();
                            map.put(str, i);
                            mapList.add(map);
                        }
                    });
            mapList.forEach(key -> System.out.println(key));
        });
    }

    public Stream checkEqual(List<String> strList, Predicate predicate, Consumer<Person> consumer) {
        return strList.stream().filter(str -> predicate.test(str));
    }


    public static void enact(MyLambdaInterface myLambda, String s) {
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