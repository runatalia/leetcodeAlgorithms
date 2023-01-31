package com.leetcode;

import additionalClasses.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class EasyAlgorithmsTest {
    @Test
    void testValidPalindrome() throws InterruptedException {
        assertEquals(true, EasyAlgorithms.validPalindrome("aba"));
        assertEquals(true, EasyAlgorithms.validPalindrome("abca"));
        assertEquals(false, EasyAlgorithms.validPalindrome("abc"));
        assertEquals(true, EasyAlgorithms.validPalindrome("cbbcc"));
    }

    @Test
    void testIsPalindrome2() throws InterruptedException {
        assertEquals(true, EasyAlgorithms.isPalindrome(" "));
        assertEquals(true, EasyAlgorithms.isPalindrome("ab_a"));
        assertEquals(false, EasyAlgorithms.isPalindrome("0P"));
        assertEquals(true, EasyAlgorithms.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, EasyAlgorithms.isPalindrome("race a car"));
    }

    @Test
    void testIsPalindrome() throws InterruptedException {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1))))));
        ListNode list3 = new ListNode(1);
        ListNode list4 = new ListNode(1, new ListNode(0, new ListNode(3)));
        ListNode list5 = new ListNode(1, new ListNode(0, new ListNode(1)));
        ListNode list6 = new ListNode(2, new ListNode(0, new ListNode(1)));
        assertEquals(true, EasyAlgorithms.isPalindrome(list1));
        assertEquals(true, EasyAlgorithms.isPalindrome(list2));
        assertEquals(true, EasyAlgorithms.isPalindrome(list3));
        assertEquals(false, EasyAlgorithms.isPalindrome(list4));
        assertEquals(true, EasyAlgorithms.isPalindrome(list5));
        assertEquals(false, EasyAlgorithms.isPalindrome(list6));

    }

    @Test
    void testIsValid() throws InterruptedException {
        assertEquals(true, EasyAlgorithms.isValid("()"));
        assertEquals(true, EasyAlgorithms.isValid("()[]{}"));
        assertEquals(false, EasyAlgorithms.isValid("(]"));
        assertEquals(false, EasyAlgorithms.isValid("}("));
        assertEquals(false, EasyAlgorithms.isValid("()("));

    }

    @Test
    void testlengthOfLastWord2() {
        assertEquals(5, EasyAlgorithms.lengthOfLastWord2("Hello World"));
        assertEquals(4, EasyAlgorithms.lengthOfLastWord2("   fly me   to   the moon  "));
        assertEquals(6, EasyAlgorithms.lengthOfLastWord2("luffy is still joyboy"));
        assertEquals(0, EasyAlgorithms.lengthOfLastWord2("   "));
        assertEquals(0, EasyAlgorithms.lengthOfLastWord2(""));
    }

    @Test
    void testlengthOfLastWord1() {
        assertEquals(5, EasyAlgorithms.lengthOfLastWord1("Hello World"));
        assertEquals(4, EasyAlgorithms.lengthOfLastWord1("   fly me   to   the moon  "));
        assertEquals(6, EasyAlgorithms.lengthOfLastWord1("luffy is still joyboy"));
        assertEquals(0, EasyAlgorithms.lengthOfLastWord1("   "));
        assertEquals(0, EasyAlgorithms.lengthOfLastWord1(""));
    }

    @Test
    void testmySqrt() {
        assertEquals(5, EasyAlgorithms.mySqrt(25));
        assertEquals(2, EasyAlgorithms.mySqrt(8));
        assertEquals(1, EasyAlgorithms.mySqrt(1));
        assertEquals(46339, EasyAlgorithms.mySqrt(2147395599));
        assertEquals(11, EasyAlgorithms.mySqrt(122));
    }

    @Test
    void testRemoveDuplicates() {
        int[] test1 = new int[]{1, 1, 2};
        int[] test2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] test3 = new int[]{1, 2, 3, 6, 6};
        int[] test4 = new int[]{1, 2, 2, 2, 3, 4, 4, 4, 7};
        int[] test5 = new int[]{2, 2, 2, 2, 2, 2, 2, 3, 4, 4, 4, 6, 6, 6};
        assertEquals(2, EasyAlgorithms.removeDuplicates(test1));
        assertEquals(5, EasyAlgorithms.removeDuplicates(test2));
        assertEquals(4, EasyAlgorithms.removeDuplicates(test3));
        assertEquals(5, EasyAlgorithms.removeDuplicates(test4));
        assertEquals(4, EasyAlgorithms.removeDuplicates(test5));


    }

    @Test
    void testRemoveElement() {
        int[] test1 = new int[]{3, 2, 2, 3};
        int[] test2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int[] test3 = new int[]{1};
        int[] test4 = new int[]{1};
        assertEquals(2, EasyAlgorithms.removeElement(test1, 3));
        assertEquals(5, EasyAlgorithms.removeElement(test2, 2));
        assertEquals(0, EasyAlgorithms.removeElement(test3, 1));
        assertEquals(1, EasyAlgorithms.removeElement(test4, 2));

    }

    @Test
    void testMoveZeroes() {
        int[] test1 = new int[]{0, 1, 0, 3, 12};
        EasyAlgorithms.moveZeroes(test1);
        int[] test2 = new int[]{0};
        EasyAlgorithms.moveZeroes(test2);
        int[] test3 = new int[]{0, 0, 1};
        EasyAlgorithms.moveZeroes(test3);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, test1);
        assertArrayEquals(new int[]{0}, test2);
        assertArrayEquals(new int[]{1, 0, 0}, test3);

    }

    @Test
    void testRemoveElements() {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6)))))));
        List<Integer> newListNode1 = new ListNode().listNodeToArrays(EasyAlgorithms.removeElements(listNode1, 6));
        List<Integer> ListNodExpect1 = new ArrayList<>();
        ListNodExpect1.add(1);
        ListNodExpect1.add(2);
        ListNodExpect1.add(3);
        ListNodExpect1.add(4);
        ListNodExpect1.add(5);
        assertEquals(ListNodExpect1, newListNode1);
        ListNode listNode2 = new ListNode();
        List<Integer> newListNode2 = new ListNode().listNodeToArrays(EasyAlgorithms.removeElements(listNode2, 1));
        List<Integer> ListNodExpect2 = new ArrayList<>();
        ListNodExpect2.add(0);
        assertEquals(ListNodExpect2, newListNode2);
        ListNode listNode3 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        List<Integer> newListNode3 = new ListNode().listNodeToArrays(EasyAlgorithms.removeElements(listNode3, 7));
        List<Integer> ListNodExpect3 = null;
        assertEquals(ListNodExpect3, newListNode3);

    }

    @Test
    void testApplyOperations() {
        int nums1[] = new int[]{0, 2, 1, 0, 5, 0};
        int nums2[] = new int[]{0, 1};
        int nums3[] = new int[]{0, 0, 1};
        int nums4[] = new int[]{1, 2, 2, 1, 1, 0};
        assertArrayEquals(new int[]{2, 1, 5, 0, 0, 0}, EasyAlgorithms.applyOperations(nums1));
        assertArrayEquals(new int[]{1, 0}, EasyAlgorithms.applyOperations(nums2));
        assertArrayEquals(new int[]{1, 0, 0}, EasyAlgorithms.applyOperations(nums3));
        assertArrayEquals(new int[]{1, 4, 2, 0, 0, 0}, EasyAlgorithms.applyOperations(nums4));
    }

    @Test
    void testSearchInsert() {
        int nums1[] = new int[]{1, 3, 5, 6};
        int nums2[] = new int[]{1, 3, 5, 6};
        int nums3[] = new int[]{1, 3, 5, 6};
        int nums4[] = new int[]{1, 3, 5, 6};
        assertEquals(2, EasyAlgorithms.searchInsert(nums1, 5));
        assertEquals(1, EasyAlgorithms.searchInsert(nums2, 2));
        assertEquals(4, EasyAlgorithms.searchInsert(nums3, 7));
        assertEquals(0, EasyAlgorithms.searchInsert(nums4, 0));
    }

    @Test
    void testFirstBadVersion() {
        assertEquals(4, EasyAlgorithms.firstBadVersion(5));
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            return "result";
        });
    }

    @Test
    void testGuessNumber() throws InterruptedException {
        assertEquals(10000, EasyAlgorithms.guessNumber(1000000));
        Assertions.assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            return "result";
        });
    }

}