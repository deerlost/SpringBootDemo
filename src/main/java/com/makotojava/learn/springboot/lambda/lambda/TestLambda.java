package com.makotojava.learn.springboot.lambda.lambda;



import com.makotojava.learn.springboot.model.Person;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;


/**
 * @Description TODO
 * @ClassName： :
 * @Package test.lambda
 * @anthor：wyang
 * @date：2018/12/17
 * @版本：V1.0
 */
public class TestLambda {

    public static void main(String[] args) {
        TestLambda.runThreadUseLambda();
        TestLambda.runThreadUseInnerClass();

        Comparator c = Comparator.comparing(Person::getAge);
        Person p1 = new Person("tom", 11);
        Person p2 = new Person("jerry", 12);
        System.out.println(c.compare(p1, p2));

      /*  JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JButton button1 = new JButton("点我!");
        JButton button2 = new JButton("也点我!");

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        //这里addActionListener方法的参数是ActionListener，是一个函数式接口
        //使用lambda表达式方式
        button1.addActionListener(a -> { System.out.println("这里是Lambda实现方式"); });
        //使用方法引用方式
        button2.addActionListener(TestLambda::doSomething);*/

        //Prior Java 8 :
        List<String> features = Arrays.asList("Lambdas", "Default Method",
                "Stream API", "Date and Time API");
        for (String feature : features) {

     //       System.out.println(feature);
        }

        List<Map<String,Object>> mapList = new ArrayList<Map<String, Object>>();
        Map<String,Object> param = new HashMap<String, Object>();
        param.put("key", "value");
        param.put("key1", "value1");
        mapList.add(param);

        mapList.forEach((str) -> System.out.println(str.get("key")));
        mapList.forEach(System.out::println);

        //In Java 8:

     //   features.forEach(n -> System.out.println(n));

// Even better use Method reference feature of Java 8
// method reference is denoted by :: (double colon) operator
// looks similar to score resolution operator of C++
//        features.forEach(System.out::println);

        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter(languages, (str)->((String) str).startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str)->((String) str).endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str)->true);

        System.out.println("Print no language : ");
        filter(languages, (str)->false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str)->((String) str).length() > 4);


        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;

        languages.stream()
                .filter(startsWithJ.and(fourLetterLong))
                .forEach((n) -> System.out.print("Name, which starts with 'J' and four letter long is : " + n));
    }

    public static void filter(List names, Predicate condition) {
        Stream steam = names.stream().filter((name) -> (condition.test(name)));

        steam.forEach((name) -> {System.out.println(name + " ");
                });
    }



    public static void runThreadUseLambda() {
        //Runnable是一个函数接口，只包含了有个无参数的，返回void的run方法；
        //所以lambda表达式左边没有参数，右边也没有return，只是单纯的打印一句话
        new Thread(() -> System.out.println("lambda实现的线程")).start();
    }

    public static void runThreadUseInnerClass() {
        //这种方式就不多讲了，以前旧版本比较常见的做法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("内部类实现的线程");
            }
        }).start();
    }


}
