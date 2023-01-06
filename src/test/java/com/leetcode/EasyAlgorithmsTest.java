package com.leetcode;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.*;


class EasyAlgorithmsTest {
    @Test
    void testMergeTwoLists() {
//        ListNode lis11 = new ListNode(1,new ListNode(2,new ListNode(4)));
//        ListNode lis12 = new ListNode(1,new ListNode(3,new ListNode(4)));
//        ListNode expectedList11 = new ListNode(1,new ListNode(1,new ListNode(2,
//                new ListNode(3,new ListNode(4,new ListNode(4))))));
//
//        assertEquals(expectedList11,EasyAlgorithms.mergeTwoLists(lis11, lis12));

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

}