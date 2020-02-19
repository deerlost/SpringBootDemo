package com.easypoi.controller;

import com.easypoi.entity.TestEntity;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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

    @Test
    public void map(){
        TestEntity te = new TestEntity();
        Map map = te.gettMap();
        map.put("1", 1);

        if(map.isEmpty())
            System.out.println("map is empty");
        System.out.println("map is not empty");

        BigDecimal remain = new BigDecimal(1040);
        BigDecimal volumeMax = new BigDecimal( 30000);
        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        numberFormat.setMinimumFractionDigits(2);
        String format = numberFormat.format(remain.divide(volumeMax, 4, BigDecimal.ROUND_UP).doubleValue());
        System.out.println(format);
    }

}
