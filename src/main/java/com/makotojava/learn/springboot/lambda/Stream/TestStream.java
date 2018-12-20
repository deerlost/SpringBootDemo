package com.makotojava.learn.springboot.lambda.Stream;


import com.makotojava.learn.springboot.util.MapUtilExample;
import com.makotojava.learn.springboot.util.StreamUtilExample;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.Stream
 * @anthor：wyang
 * @date：2018/12/20
 * @版本：V1.0
 */
public class TestStream {

    public static void main(String[] args) {
 /*       StreamUtilExample example = new StreamUtilExample();


        example.useStreamFilter();
        System.out.println("==============================");
        example.useStreamMap();
        System.out.println("==============================");

        example.useStreamMatch();
        System.out.println("==============================");

        example.useStreamCount();
        System.out.println("==============================");

        example.useStreamReduce();
        System.out.println("==============================");

        example.useParallelStreams();
        System.out.println("==============================");*/


        MapUtilExample mapExample = new MapUtilExample();

        mapExample.forEach();
        System.out.println("forEach:   ==============================");
        mapExample.compute();
        System.out.println("compute:   ==============================");
        mapExample.remove();
        System.out.println("remove:   ==============================");
        mapExample.getOrDefault();
        System.out.println("getOrDefault:   ==============================");
        mapExample.merge();
        System.out.println("merge:   ==============================");
    }
}
