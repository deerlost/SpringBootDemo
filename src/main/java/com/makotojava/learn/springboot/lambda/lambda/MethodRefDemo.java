package com.makotojava.learn.springboot.lambda.lambda;


import com.makotojava.learn.springboot.lambda.inter.StringFunc;
import com.makotojava.learn.springboot.lambda.tool.MyStringOps;
import com.makotojava.learn.springboot.model.Car;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.lambda
 * @anthor：wyang
 * @date：2018/12/24
 * @版本：V1.0
 */
public class MethodRefDemo {
    public static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }


    public static void main(String[] args) {
        String inStr = "lambda add power to Java";
        //MyStringOps::strReverse 相当于实现了接口方法func() ，并在接口方法func()中作了MyStringOps.strReverse()操作
        List<String> strList = Arrays.asList(inStr);
        strList.stream().map(MyStringOps::strReverse).forEach(System.out::println);

        MyStringOps strOps = new MyStringOps();//实例对象
        //MyStringOps::strReverse 相当于实现了接口方法func() ，并在接口方法func()中作了MyStringOps.strReverse()操作
        String oStr = stringOp(strOps::stringReverse, inStr);


        String outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);


        Car car = new Car();
        List<Car> carList = car.getCarList();

        Car carMax = Collections.max(carList,Car::compare);
        System.out.println("The newest Car is "+carMax.getModel()+"__"+carMax.getYear());

    }

}
