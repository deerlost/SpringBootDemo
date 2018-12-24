package com.makotojava.learn.springboot.lambda.lambda;


import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.lambda
 * @anthor：wyang
 * @date：2018/12/21
 * @版本：V1.0
 */
public class UseMap {

    public static void main(String[] args) {

        Map<String, Integer> pageVisits = new HashMap<>();

        String page = "https://github.com";

        //  incrementPageVisit(pageVisits, page);
        // incrementPageVisit(pageVisits, page);


        Integer newV = pageVisits.merge(page, 1, (value, newValue) -> pageVisits.get(page) + newValue);//pageVisits.get(page) = value newValue=1
        // pageVisits.merge(page, 1, (oldValue, value) -> oldValue + value);

        System.out.println(pageVisits.get(page));
    }

    private static void incrementPageVisit(Map<String, Integer> pageVisits, String page) {

        if (!pageVisits.containsKey("page")) {
            pageVisits.put(page, 0);
        }
        pageVisits.put(page, pageVisits.get(page) + 1);
    }
}
