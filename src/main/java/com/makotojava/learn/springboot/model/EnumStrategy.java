package com.makotojava.learn.springboot.model;


import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @Description TODO
 * @ClassName：EnumStrategy :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2019/7/10
 * @版本：V1.0
 */
public enum EnumStrategy {
    FAST1 ((byte)1,"fast"){
        @Override
        public void run() {
            //do something
            System.out.println("调用的是fast");
        }
    },
    NORMAL((byte)2,"normal") {
        @Override
        public void run() {
            //do something
            System.out.println("调用的是normal");
        }
    },
    SMOOTH((byte)3,"smooth") {
        @Override
        public void run() {
            //do something
            System.out.println("调用的是smooth");
        }
    },
    SLOW((byte)4,"slow") {
        @Override
        public void run() {
            //do something
            System.out.println("调用的是slow");
        }
    };
    private static final Map<Byte,EnumStrategy> stringToEnum = Stream.of(values()).collect(toMap(EnumStrategy::getValue,e->e));

    public static Optional<EnumStrategy> fromString(Byte symbol){
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public abstract void run();

    private Byte value;

    private String type;


    public Byte getValue() {
        return value;
    }

    public EnumStrategy setValue(Byte value) {
        this.value = value;
        return this;
    }

    public String getType() {
        return type;
    }

    public EnumStrategy setType(String type) {
        this.type = type;
        return this;
    }

    EnumStrategy(Byte value , String type) {
        this.type = type;
        this.value = value;
    }
}
