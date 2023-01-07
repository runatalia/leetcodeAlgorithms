package com.leetcode;


import additionalClasses.ListNode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1};
        EasyAlgorithms.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
