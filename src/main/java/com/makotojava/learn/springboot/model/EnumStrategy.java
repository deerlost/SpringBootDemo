package com.makotojava.learn.springboot.model;


/**
 * @Description TODO
 * @ClassName：EnumStrategy :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2019/7/10
 * @版本：V1.0
 */
public enum EnumStrategy {
    FAST ("fast"){
        @Override
        public void run() {
            //do something
            System.out.println("调用的是fast");
        }
    },
    NORMAL("normal") {
        @Override
        public void run() {
            //do something
            System.out.println("调用的是normal");
        }
    },
    SMOOTH("smooth") {
        @Override
        public void run() {
            //do something
            System.out.println("调用的是smooth");
        }
    },
    SLOW("slow") {
        @Override
        public void run() {
            //do something
            System.out.println("调用的是slow");
        }
    };

    public abstract void run();

    private String type;

    EnumStrategy(String type) {
        this.type = type;
    }
}
