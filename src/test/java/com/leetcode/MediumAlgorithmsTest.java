package com.leetcode;

import org.junit.jupiter.api.Test;

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

    @Test
    public void testTriangularSum() {

    }

    @Test
    public void testIntToRoman() {

    }

}
