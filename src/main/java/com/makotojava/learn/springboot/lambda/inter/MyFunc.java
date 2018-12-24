package com.makotojava.learn.springboot.lambda.inter;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.inter
 * @anthor：wyang
 * @date：2018/12/24
 * @版本：V1.0
 */
@FunctionalInterface
public interface MyFunc<T> {
    boolean func(T v1, T v2);
}
