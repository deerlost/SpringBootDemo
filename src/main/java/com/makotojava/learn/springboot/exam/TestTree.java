package com.makotojava.learn.springboot.exam;


import com.makotojava.learn.springboot.model.Tree;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.exam
 * @anthor：wyang
 * @date：2018/12/20
 * @版本：V1.0
 */
public class TestTree {

    public static void main(String[] args) {

    }


    /**
     * 根据key更新二叉树的val
     * 一般写法
     **/

    public static Tree update(String key, int newval, Tree t) {
        if (t == null) {
            t = new Tree(key, newval, null, null);
        } else if (key.equals(t.key)) {
            t.val = newval;
        } else if (key.compareTo(t.key) < 0) {
            t.left = update(key, newval, t.left);
        } else {
            t.right = update(key, newval, t.right);
        }
        return t;
    }

    /**
     * 根据key更新二叉树的val
     * 函数式写法
     **/
    public static Tree append(String k, int newval, Tree t) {
        return t == null ? new Tree(k, newval, null, null) :
                k.equals(t.key) ?
                        new Tree(k, newval, t.left, t.right) :
                        k.compareTo(t.key) < 0 ?
                                new Tree(k, newval, append(k, newval, t.left), t.right) :
                                new Tree(k, newval, t.left, append(k, newval, t.right));
    }


}
