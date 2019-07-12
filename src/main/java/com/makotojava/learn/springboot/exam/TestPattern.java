package com.makotojava.learn.springboot.exam;


import com.makotojava.learn.springboot.model.EnumStrategy;
import com.makotojava.learn.springboot.model.SpiderMan;
import com.makotojava.learn.springboot.model.testEnum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description TODO
 * @ClassName：TestPattern :
 * @Package com.makotojava.learn.springboot.exam
 * @anthor：wyang
 * @date：2019/2/27
 * @版本：V1.0
 */
public class TestPattern {
    public static void main(String[] args) {

        SpiderMan spiderMan = new SpiderMan("spider", 16, "American");

        spiderMan.testName();

        testEnum.useEnum("FAST");

        EnumStrategy strategy = EnumStrategy.valueOf("NORMAL".toUpperCase());
        strategy.run();
        Pattern p = Pattern.compile("[0-9]*");
        Matcher m = p.matcher(".0313213");
        boolean b = m.matches();

        boolean c = Pattern.matches("[0-9]*", "1313");
        if (c) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }


      /*  func:
        for (int i = 0; i < 5; i++) {
            if ((i % 2) != 0) {
                continue func;
            }
            System.out.println(" ......................阿弥陀佛......................\n" +
                    "                       _oo0oo_                      \n" +
                    "                      o8888888o                     \n" +
                    "                      88\" . \"88                     \n" +
                    "                      (| -_- |)                     \n" +
                    "                      0\\  =  /0                     \n" +
                    "                   ___/‘---’\\___                   \n" +
                    "                  .' \\|       |/ '.                 \n" +
                    "                 / \\\\|||  :  |||// \\                \n" +
                    "                / _||||| -卍-|||||_ \\               \n" +
                    "               |   | \\\\\\  -  /// |   |              \n" +
                    "               | \\_|  ''\\---/''  |_/ |              \n" +
                    "               \\  .-\\__  '-'  ___/-. /              \n" +
                    "             ___'. .'  /--.--\\  '. .'___            \n" +
                    "         .\"\" ‘<  ‘.___\\_<|>_/___.’>’ \"\".          \n" +
                    "       | | :  ‘- \\‘.;‘\\ _ /’;.’/ - ’ : | |        \n" +
                    "         \\  \\ ‘_.   \\_ __\\ /__ _/   .-’ /  /        \n" +
                    "    =====‘-.____‘.___ \\_____/___.-’___.-’=====     \n" +
                    "                       ‘=---=’                      \n" +
                    "                                                    \n" +
                    "....................佛祖保佑 ,永无BUG...................");
        }*/

    }
}


