package com.makotojava.learn.springboot.model;


/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2018/12/20
 * @版本：V1.0
 */
public class Tree {

    public String key;
    public int val;
    public Tree left, right;

    public Tree(String key, int newval, Tree l, Tree r) {
        this.key = key;
        this.val = newval;
        this.left = l;
        this.right = r;
    }
}
