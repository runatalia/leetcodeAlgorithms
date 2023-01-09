package com.leetcode;


import additionalClasses.ListNode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1};
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6)))))));
        // ListNode listNode = new ListNode();
        // ListNode listNode = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        EasyAlgorithms.removeElements(listNode, 6);
        //   System.out.println(listNode.val);
    }


}
