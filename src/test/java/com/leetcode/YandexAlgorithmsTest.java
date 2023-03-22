package com.leetcode;

import anotherTasks.yandexAlgorithms.YandexAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YandexAlgorithmsTest {

    @Test
    void testTankLeveling1() {
        int n1 = 2;
        int[] arr1 = new int[]{1, 2};
        int n2 = 5;
        int[] arr2 = new int[]{1, 1, 5, 5, 5};
        int n3 = 3;
        int[] arr3 = new int[]{3, 2, 1};
        assertEquals(1, YandexAlgorithms.tankLeveling1(n1, arr1));
        assertEquals(4, YandexAlgorithms.tankLeveling1(n2, arr2));
        assertEquals(-1, YandexAlgorithms.tankLeveling1(n3, arr3));
    }

    @Test
    void testTankLeveling2() {
        int n1 = 2;
        int[] arr1 = new int[]{1, 2};
        int n2 = 5;
        int[] arr2 = new int[]{1, 1, 5, 5, 5};
        int n3 = 3;
        int[] arr3 = new int[]{3, 2, 1};
        assertEquals(1, YandexAlgorithms.tankLeveling2(n1, arr1));
        assertEquals(4, YandexAlgorithms.tankLeveling2(n2, arr2));
        assertEquals(-1, YandexAlgorithms.tankLeveling2(n3, arr3));
    }
}