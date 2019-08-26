package com.easypoi.controller;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description TODO
 * @ClassName：test :
 * @Package com.easypoi.controller
 * @anthor：wyang
 * @date：2019/4/10
 * @版本：V1.0
 */
public class test {


    @Test
    public void testStr(){

        List<String> inputString = Arrays.asList("80099864101//第一行","80099864101//第二行");

        List<String> outString = Arrays.asList("80099864101//第一行","80099864101//第二行");

        List<String> result = inputString.stream().filter(in -> outString.contains(in)).collect(Collectors.toList());

    }

}
