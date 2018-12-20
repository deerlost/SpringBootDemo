package com.makotojava.learn.springboot.lambda.lambda;


import com.makotojava.learn.springboot.model.Person;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Description TODO list 去重 uniq
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.lambda
 * @anthor：wyang
 * @date：2018/12/19
 * @版本：V1.0
 */
public class TestDistinct {
    public static void main(String[] args) {

        List<Map<String, Object>> distinctList = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "Tom");
        distinctList.add(map);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", 1);
        map2.put("name", "Jerry");
        distinctList.add(map2);
        distinctList.stream().filter(distinctByKey(m -> m.get("id"))).collect(Collectors.toList()).forEach(m -> System.out.println(m));

        Person lokesh = new Person("Lokesh", 1);
        Person brian = new Person("Brian", 2);
        Person alex = new Person("Alex", 3);

        List<Person> people = Arrays.asList(lokesh,brian,alex,lokesh,brian,alex);

        people.stream().filter(distinctByKey(p -> p.getAge())).collect(Collectors.toList()).forEach(p -> System.out.println(p.getName()));



    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
