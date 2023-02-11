package com.leetcode;

import additionalClasses.ListNode;

import java.util.*;


public class EasyAlgorithms {

    /*longestCommonPrefix(String[] strs)
    
    Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

    Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

    Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/
    public static String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        String result = "";
        for (int i = 1; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }
        for (int i = 0; i < min; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    return result;
                }
            }
            result += strs[0].charAt(i);
        }
        return result;
    }

    /*  boolean isPalindrome(int x)
    Given an integer x, return true if x is a  palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.  */
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    /*int[] twoSum(int[] nums, int target)
    
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]*/
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /*int minMaxGame(int[] nums)
        
        You are given a 0-indexed integer array nums whose length is a power of 2.
Apply the following algorithm on nums:

Let n be the length of nums. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n / 2.
For every even index i where 0 <= i < n / 2, assign the value of newNums[i] as min(nums[2 * i], nums[2 * i + 1]).
For every odd index i where 0 <= i < n / 2, assign the value of newNums[i] as max(nums[2 * i], nums[2 * i + 1]).
Replace the array nums with newNums.
Repeat the entire process starting from step 1.
Return the last number that remains in nums after applying the algorithm.

Example 1:
Input: nums = [1,3,5,2,4,8,2,2]
Output: 1
Explanation: The following arrays are the results of applying the algorithm repeatedly.
First: nums = [1,5,4,2]
Second: nums = [1,4]
Third: nums = [1]
1 is the last remaining number, so we return 1.
Example 2:

Input: nums = [3]
Output: 3
Explanation: 3 is already the last remaining number, so we return 3.*/
    public static int minMaxGame(int[] nums) {
        int n = nums.length;
        for (int i = (n / 2); i >= 1; i--) {
            for (int j = 0, k = 0; j < n; j += 2, k++) {
                if (k % 2 == 0) {
                    nums[k] = Math.min(nums[j], nums[j + 1]);
                } else {
                    nums[k] = Math.max(nums[j], nums[j + 1]);
                }
            }
            n /= 2;
        }
        return nums[0];
    }

    /* List<Integer> getRow(int k)  Pascal's Triangle II
    Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
     */
    public static List<Integer> getRow(int k) {
        Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;

        for (int i = 1; i <= k; i++) {
            for (int j = i; j > 0; j--) {
                arr[j] = arr[j] + arr[j - 1];
            }
        }

        return Arrays.asList(arr);
    }

    /* Pascal's Triangle List<List<Integer>> generate(int numRows)
      Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }

    /* Roman to Integer
      Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i));
            } else {
                res += map.get(s.charAt(i));
            }
        }
        return res + map.get(s.charAt(s.length() - 1));
    }


    /*You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.*/
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }
/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.*/

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }

//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
//
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
//
//Return k after placing the final result in the first k slots of nums.
//
//Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

    public static int removeElement(int[] nums, int val) {
        int j = nums.length;
        for (int i = 0; i < j; i++) {
            if (nums[i] == val) {
                nums[i] = nums[--j];
                i--;
            }
        }
        return j;
    }


    //283. Move Zeroes
//    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//    Note that you must do this in-place without making a copy of the array.
    public static void moveZeroes(int[] nums) {
        int l = nums.length - 1;
        for (int i = 0; i <= l; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < l; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
                nums[l--] = 0;
            }
        }
    }

    //203. Remove Linked List Elements
    //Given the head of a linked list and an integer val,
    // remove all the nodes of the linked list that has Node.val == val, and return the new head.

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode node = removeElements(head.next, val);
        if (head.val == val) return node;
        head.next = node;
        return head;
    }

    //2460. Apply Operations to an Array
//You are given a 0-indexed array nums of size n consisting of non-negative integers.
//
//You need to apply n - 1 operations to this array where, in the ith operation (0-indexed), you will apply the following on the ith element of nums:
//
//If nums[i] == nums[i + 1], then multiply nums[i] by 2 and set nums[i + 1] to 0. Otherwise, you skip this operation.
//After performing all the operations, shift all the 0's to the end of the array.
//
//For example, the array [1,0,2,0,0,1] after shifting all its 0's to the end, is [1,2,1,0,0,0].
//Return the resulting array.
//
//Note that the operations are applied sequentially, not all at once.
    public static int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int k = 0;
        int a;
        int l = nums.length - 1;
        while (k < l) {
            if (nums[k] == 0) {
                for (int i = k; i < l; i++) {
                    a = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = a;
                }
                l--;
                k--;
            }
            k++;
        }
        return nums;
    }
    //35. Search Insert Position
    //Given a sorted array of distinct integers and a target value,
    // return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    //You must write an algorithm with O(log n) runtime complexity.

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if ((i < nums.length - 1
                    && target > nums[i] && target < nums[i + 1])) {
                index = i + 1;
            }
        }
        return (target > nums[nums.length - 1]) ? nums.length : index;
    }

//278. First Bad Version
    //You are a product manager and currently leading a team to develop a new product.
    // Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
    //
    //Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
    // which causes all the following ones to be bad.
    //
    //You are given an API bool isBadVersion(version) which returns whether version is bad.
    // Implement a function to find the first bad version. You should minimize the number of calls to the API.

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public static int firstBadVersion(int n) {  //Binary Search
        int left = 0;
        int right = n;
        int middle;
        while (left < right) {
            middle = left + (right - left) / 2;
            if (isBadVersion(middle)) right = middle;
            else left = middle + 1;
        }
        return left;
    }

    public static boolean isBadVersion(int i) {
        int k = 4;
        return k <= i;
    }

    //374. Guess Number Higher or Lower
// We are playing the Guess Game. The game is as follows:
//
//I pick a number from 1 to n. You have to guess which number I picked.
//
//Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
//
//You call a pre-defined API int guess(int num), which returns three possible results:
//
//-1: Your guess is higher than the number I picked (i.e. num > pick).
//1: Your guess is lower than the number I picked (i.e. num < pick).
//0: your guess is equal to the number I picked (i.e. num == pick).
//Return the number that I picked.
//
//
    public static int guessNumber(int n) {
        int left = 0;
        int right = n;
        int middle = n;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (guess(middle) == -1) {
                right = middle;
            } else if (guess(middle) == 1) {
                left = middle + 1;
            } else return middle;
        }
        return middle;
    }

    public static int guess(int i) {
        int k = 10000;
        if (k < i) return -1;
        if (k > i) return 1;
        return 0;
    }

    //69. Sqrt(x)
    //Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
    //
    //You must not use any built-in exponent function or operator.
    //
    //For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
    public static int mySqrt(int x) {
        int divider;
        int left = 1;
        int right = x;
        if (x == 0) return 0;
        while (true) {
            divider = left + (right - left) / 2;
            if (divider > x / divider) {
                right = divider;
            } else {
                if ((divider + 1) > x / (divider + 1))
                    return divider;
                left = divider + 1;
            }
        }


    }
    //367. Valid Perfect Square
    // Given a positive integer num, return true if num is a perfect square or false otherwise.
    //A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
    //You must not use any built-in library function, such as sqrt.

    public static boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        double sqrt;
        while (left <= right) {
            sqrt = left + (right - left) / 2;
            if (sqrt == num / sqrt) {
                return true;
            }
            if (sqrt > num / sqrt) {
                right = (int) sqrt - 1;
            } else if (sqrt < num / sqrt)
                left = (int) sqrt + 1;
        }
        return false;
    }

    //Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//A word is a maximal
//substring
// consisting of non-space characters only.
    public static int lengthOfLastWord1(String s) {
        String[] newStr = s.trim().split(" ");
        return newStr[newStr.length - 1].length();

    }

    public static int lengthOfLastWord2(String s) {
        int count = 0;
        int countLast = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != 32) {
                count++;
                if (i == s.length() - 1) {
                    return count;
                }
            } else {
                if (count != 0) countLast = count;
                count = 0;
            }
            i++;
        }
        return countLast;
    }

    //20. Valid Parentheses
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char a;
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            if (a == '(' || a == '{' || a == '[') stack.add(a);
            else if (stack.isEmpty()) return false;
            else if (a == '}' && stack.peekLast() == '{') stack.pollLast();
            else if (a == ')' && stack.peekLast() == '(') stack.pollLast();
            else if (a == ']' && stack.peekLast() == '[') stack.pollLast();
        }
        return stack.isEmpty();
    }

    //Given the head of a singly linked list, return true if it is a
//palindrome
// or false otherwise.
    public static boolean isPalindrome(ListNode head) {
        Deque<Integer> deq = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        if (list.isEmpty() || list.size() == 1) return true;
        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {
            if (list.get(i) != list.get(j)) return false;

        }
        return true;
    }

    //A phrase is a palindrome if, after converting all uppercase letters
    // into lowercase letters and removing all non-alphanumeric characters,
    // it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    //Given a string s, return true if it is a palindrome, or false otherwise.
    public static boolean isPalindrome(String s) {
        char[] str = s.replaceAll("[\\s_\\W]", "").toLowerCase().toCharArray();
        for (int i = 0, j = str.length - 1; i < str.length / 2; i++, j--) {
            if (str[i] != str[j]) return false;
        }
        return true;

    }

    //Given a string s, return true if the s can be palindrome after deleting at most one character from it.
    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                if (checkPolindrom(s, i + 1, j)) return true;
                return checkPolindrom(s, i, j - 1);
            }
        }
        return true;
    }

    private static boolean checkPolindrom(String s, int i, int j) {
        for (; i < (s.length() + 1) / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean backspaceCompare(String s, String t) {
        return helpBackspaceCompare(s).equals(helpBackspaceCompare(t));
    }

    public static String helpBackspaceCompare(String s) {
        ArrayDeque deque = new ArrayDeque();
        for (char a : s.toCharArray()) {
            if (a != '#') {
                deque.addLast(a);
            } else deque.pollLast();
        }
        return String.valueOf(deque);
    }

    //67. Add Binary
    //Given two binary strings a and b, return their sum as a binary string.
    public static String addBinary(String a, String b) {
        String result = "";
        int maxLen = Math.max(a.length(), b.length());
        char[] aArray = new char[maxLen];
        char[] bArray = new char[maxLen];
        if (a.length() != maxLen) System.arraycopy(a.toCharArray(), 0, aArray, maxLen - a.length(), a.length());
        else aArray = a.toCharArray();
        if (b.length() != maxLen) System.arraycopy(b.toCharArray(), 0, bArray, maxLen - b.length(), b.length());
        else bArray = b.toCharArray();
        for (int i = maxLen - 1; i >= 0; i--) {
            if (aArray[i] == '0' && bArray[i] == '0') result += 0;
            else if (aArray[i] == '0' && bArray[i] == '1') result += 1;
            else if (aArray[i] == '1' && bArray[i] == '0') result += 1;
            else {
                result += 0;
                if (i != 0) {
                    if (aArray[i - 1] == '0') aArray[i - 1] = '1';
                    else aArray[i - 1] = '0';
                }
            }
        }
        if (aArray[0] == '1' && bArray[0] == '1') result += 1;


        return result;
    }
    //136. Single Number
    //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    //You must implement a solution with a linear runtime complexity and use only constant extra space.

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

    public static int[] plusOne(int[] nums) {
        String str = Arrays.toString(nums);
        String newStr = Integer.parseInt(str) + 1 + "";
        int[] newNums = new int[newStr.length()];
        for (int i = 0; i < newStr.length(); i++) {
            newNums[i] = newStr.charAt(i);
        }
        return newNums;
    }
}









