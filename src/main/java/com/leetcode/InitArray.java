package com.leetcode;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Description TODO
 * @ClassName：InitArray :
 * @Package com.leetcode
 * @anthor：wyang
 * @date：2020/3/16
 * @版本：V1.0
 */
public class InitArray {


    public static void main(String[] args) {

        int[] myarray = new int[10];

        Integer[] integers = new Integer[10];

        Arrays.fill(myarray, -1);

        int[] ints = ArrayUtils.toPrimitive(integers);


    }

    /*public static boolean f1(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node temp = head;
        Stack<Node> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        while (!stack.isEmpty()) {
            Node t = stack.pop();
            if (t.value != head.value) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
*/

}
