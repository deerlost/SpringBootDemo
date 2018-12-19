package com.makotojava.learn.springboot.lambda.inter;


/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.inter
 * @anthor：wyang
 * @date：2018/12/18
 * @版本：V1.0
 */
@FunctionalInterface
public interface MyLambdaInter<T> {

    Long toLong(T t);
}
