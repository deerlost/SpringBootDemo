package com.makotojava.learn.springboot.model;


/**
 * @Description TODO 保存火车站点的票务信息
 * @ClassName： : 利用简单的单向链表
 * 我们有一个类用来保存火车站点的票务信息
 * 表示从A地到B地的火车旅行，旅途中我们需要换车，
 * 所以需要使用几个由onward字段串联在一起的TrainJourney对象，
 * 直达火车或者旅途的最后一段onward为null
 * @Package com.makotojava.learn.springboot.lambda.model
 * @anthor：wyang
 * @date：2018/12/20
 * @版本：V1.0
 */
public class TrainJourney {

    public int price;
    public TrainJourney onward;

    public TrainJourney(int price, TrainJourney t) {
        this.price = price;
        this.onward = t;
    }


}
