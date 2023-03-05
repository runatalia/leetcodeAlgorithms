package com.leetcode;

import additionalClasses.LinkedList1;
import additionalClasses.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MediumAlgorithms {

    /*We want to split a group of n people (labeled from 1 to n) into two groups of any size. Each person may dislike some other people, and they should not go into the same group.

Given the integer n and the array dislikes where dislikes[i] = [ai, bi] indicates that the person labeled ai does not like the person labeled bi, return true if it is possible to split everyone into two groups in this way.

 

Example 1:

Input: n = 4, dislikes = [[1,2],[1,3],[2,4]]
Output: true
Explanation: group1 [1,4] and group2 [2,3].
Example 2:

Input: n = 3, dislikes = [[1,2],[1,3],[2,3]]
Output: false
Example 3:

Input: n = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
Output: false*/

    public static boolean possibleBipartition(int N, int[][] dislikes) {
        List<Integer>[] graph = new List[N + 1];

        for (int i = 1; i <= N; ++i) graph[i] = new ArrayList<>();

        for (int[] dislike : dislikes) {
            graph[dislike[0]].add(dislike[1]);
            graph[dislike[1]].add(dislike[0]);
        }

        Integer[] colors = new Integer[N + 1];

        for (int i = 1; i <= N; ++i) {

            if (colors[i] == null && !dfs(graph, colors, i, 1)) return false;
        }
        return true;
    }

    private static boolean dfs(List<Integer>[] graph, Integer[] colors, int currNode, int currColor) {
        colors[currNode] = currColor;


        for (Integer adjacentNode : graph[currNode]) {

            if (colors[adjacentNode] == null) {
                if (!dfs(graph, colors, adjacentNode, currColor * -1)) return false;

            } else if (colors[adjacentNode] == currColor) {
                return false;
            }
        }
        return true;
    }


    /*triangularSum(int[] nums)
    You are given a 0-indexed integer array nums, where nums[i] is a digit between 0 and 9 (inclusive).

The triangular sum of nums is the value of the only element present in nums after the following process terminates:

Let nums comprise of n elements. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n - 1.
For each index i, where 0 <= i < n - 1, assign the value of newNums[i] as (nums[i] + nums[i+1]) % 10, where % denotes modulo operator.
Replace the array nums with newNums.
Repeat the entire process starting from step 1.
Return the triangular sum of nums.

Example 1:
Input: nums = [1,2,3,4,5]
Output: 8
Explanation:
The above diagram depicts the process from which we obtain the triangular sum of the array.
Example 2:

Input: nums = [5]
Output: 5
Explanation:
Since there is only one element in nums, the triangular sum is the value of that element itself.*/
    public static int triangularSum(int[] nums) {
        int length = nums.length;
        while (length > 1) {
            for (int i = 0; i < length - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            length--;
        }
        return nums[0];
    }

    /* Integer to Roman   public String intToRoman(int num) 
        Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

 

Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] div = {1000, 900, 500, 400, 100, 90,
                50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < div.length; ) {
            if (num >= div[i]) {
                result.append(roman[i]);
                num -= div[i];
            } else {
                i++;
            }
        }

        return result.toString();
    }

    //2. Add Two Numbers
    //You are given two non-empty linked lists representing two non-negative integers.
    // The digits are stored in reverse order, and each of their nodes contains a single digit.
    // Add the two numbers and return the sum as a linked list.
    //You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) { //прорешать при переполнении
        ListNode head = new ListNode(), node = head;
        int sum = 0;
        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            node.val = sum % 10;
            node.next = new ListNode();
            node = node.next;
            sum = sum / 10;
        }
        return head;
    }
}


