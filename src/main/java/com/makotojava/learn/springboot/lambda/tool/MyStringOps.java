package com.makotojava.learn.springboot.lambda.tool;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.tool
 * @anthor：wyang
 * @date：2018/12/24
 * @版本：V1.0
 */
public class MyStringOps {
    //静态方法： 反转字符串
    public static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //普通方法： 反转字符串
    public String stringReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }


}
