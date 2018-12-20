package com.makotojava.learn.springboot.exam;


import com.makotojava.learn.springboot.model.TrainJourney;

/**
 * @Description TODO 测试破坏式更新和 函数式更新
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.lambda
 * @anthor：wyang
 * @date：2018/12/20
 * @版本：V1.0
 */
public class TestTrainJourney {


    public static void main(String[] args) {

    }



    /**
     * 假设我们有几个互相分隔的TrainJourney对象分别代表A到B，B到C的旅行。我们希望建立一段新的旅行，它能将两个TrainJourney对象串联起来(即从A到B到C)
     * 传统命令式的方法:
     *
     * @return t.onward = b;这个操作之后return的还是a，这就出现了一个问题，这里我们进行的操作是直接修改了参数a，
     * 也就是参数a在执行完这个方法之后原来的数据结构就被改变了
     */
    public static TrainJourney link(TrainJourney a, TrainJourney b) {
        if (a == null) {
            return b;
        }
        TrainJourney t = a;
        while (a.onward != null) {
            t = a.onward;
        }
        t.onward = b;// a->b
        return a;
    }

    /**
     *如果我们需要使用表示计算结果的数据结果，那么请创建它的一个副本而不要直接修改现存的数据结构。
     * 这个最佳的实践也适用于标准的面向对象程序设计。
     *
     * */
    public static TrainJourney link1(TrainJourney a, TrainJourney b) {
        if (a == null) {
            return b;
        }
        TrainJourney t = new TrainJourney(a.price, a.onward);
        TrainJourney t1 = a;
        TrainJourney t2 = t;
        while (t1.onward != null) {
            t2.onward = new TrainJourney(t1.onward.price, t1.onward.onward);
            t2 = t2.onward;
            t1 = t1.onward;
        }
        t2.onward = b;
        return t;
    }

    /**
     *上述代码就是我们修改之后的代码，但是我们可以看到while语句中多次使用了new关键字创建对象来复制链表。
     * 但是这种方法会导致过度的对象复制。这时候，如果我们采用函数式编程的方法
     *
     * */
    public static TrainJourney append (TrainJourney a, TrainJourney b) {
        return a == null ? b : new TrainJourney (a.price, append(a.onward, b));
    }

}
