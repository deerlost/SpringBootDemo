package com.makotojava.learn.springboot.model;


/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2018/12/24
 * @版本：V1.0
 */
public class HighTemp {
    private int hTemp;

    public HighTemp(int ht) {
        hTemp = ht;
    }

    public boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    public boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }

}
