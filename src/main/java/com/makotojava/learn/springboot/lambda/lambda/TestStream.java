package com.makotojava.learn.springboot.lambda.lambda;


import com.makotojava.learn.springboot.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;

/**
 * @Description TODO
 * @ClassName： :
 * @Package test.lambda
 * @anthor：wyang
 * @date：2018/12/17
 * @版本：V1.0
 */
public class TestStream {

    public static void main(String[] args) {
       /* List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter(languages, (str) -> ((String) str).startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str) -> ((String) str).endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str) -> true);

        System.out.println("Print no language : ");
        filter(languages, (str) -> false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str) -> ((String) str).length() > 4);*/


        List<Person> guiltyPersons = Arrays.asList(
                new Person("zixing", 25),
                new Person("Zanggui", 30),
                new Person("Chao", 29)
        );

        checkAndExecute(guiltyPersons, p -> p.getName().startsWith("Z") || p.getAge()<26, p -> System.out.println(p.getName()+"---"+p.getAge()),p ->p.getAge() );
    }


    public static void checkAndExecute(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer, ToLongFunction<Person> function) {
        personList.stream().filter(person -> predicate.test(person)).forEach(person -> consumer.accept(person));

        personList.stream().mapToLong(person -> function.applyAsLong(person));
        /*for (Person person : personList) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }*/
    }

    public static void filter(List names, Predicate condition) {
        Stream steam = names.stream().filter((name) -> (condition.test(name)));

        steam.forEach((name) -> {
            System.out.println(name + " ");
        });
    }

}
