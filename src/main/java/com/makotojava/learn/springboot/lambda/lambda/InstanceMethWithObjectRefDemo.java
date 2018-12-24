package com.makotojava.learn.springboot.lambda.lambda;


import com.makotojava.learn.springboot.lambda.inter.MyFunc;
import com.makotojava.learn.springboot.model.HighTemp;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.lambda
 * @anthor：wyang
 * @date：2018/12/24
 * @版本：V1.0
 */
public class InstanceMethWithObjectRefDemo {
    public static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)};

        //HighTemp::sameTemp 为实例方法引用
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");
        HighTemp[] weekDayHighs2 = {
                new HighTemp(31), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)};

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(count + " days had a high of 12");

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println(count + " days had a high less than 89");

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println(count + " days had a high of less than 19");
    }

}
