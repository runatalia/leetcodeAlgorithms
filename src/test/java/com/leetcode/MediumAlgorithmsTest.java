package com.leetcode;

import additionalClasses.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MediumAlgorithmsTest {

    public MediumAlgorithmsTest() {
    }

    @Test
    public void testPossibleBipartition() {
        System.out.println("possibleBipartition");
        int n1 = 3;
        int n2 = 5;
        int n3 = 4;
        int n4 = 5;
        int[][] dislikes1 = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        int[][] dislikes2 = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        int[][] dislikes3 = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        int[][] dislikes4 = new int[][]{{1, 2}, {1, 3}, {1, 4}, {1, 5}};
        assertEquals(false, MediumAlgorithms.possibleBipartition(n1, dislikes1));
        assertEquals(false, MediumAlgorithms.possibleBipartition(n2, dislikes2));
        assertEquals(false, MediumAlgorithms.possibleBipartition(n3, dislikes3));
        assertEquals(true, MediumAlgorithms.possibleBipartition(n4, dislikes4));
    }

    public void testAddTwoNumbers() {
        ListNode l = new ListNode();
        ListNode node1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode node2 = new ListNode(2, new ListNode(4, new ListNode(9, new ListNode(5))));
        ListNode node3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode node4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode node5 = new ListNode(0);
        ListNode node6 = new ListNode(0);
        ListNode node7 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode node8 = new ListNode(5, new ListNode(6, new ListNode(4)));
        assertEquals(List.of(0), l.listNodeToArrays(MediumAlgorithms.addTwoNumbers(node1, node2)));
        assertEquals(List.of(8, 9, 9, 9, 0, 0, 0, 1), l.listNodeToArrays(MediumAlgorithms.addTwoNumbers(node3, node4)));
        assertEquals(List.of(0), l.listNodeToArrays(MediumAlgorithms.addTwoNumbers(node5, node6)));
        assertEquals(List.of(7, 0, 8), l.listNodeToArrays(MediumAlgorithms.addTwoNumbers(node7, node8)));
    }

    @Test
    public void testTriangularSum() {

    }

    @Test
    public void testIntToRoman() {

    }

}
