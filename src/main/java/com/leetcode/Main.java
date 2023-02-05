package com.leetcode;


import additionalClasses.ListNode;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        Iterator it = ar.iterator();
        //ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1))))));
        //    ListNode list = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        //ListNode list = new ListNode(1);

        System.out.println(EasyAlgorithms.addBinary("11", "1"));
//        ThreadLocal<String> threadLocal = new ThreadLocal<>();
//        ExecutorService service = Executors.newFixedThreadPool(5);
//        service.execute(new Runnable() {
//            @Override
//            public void run() {
//                threadLocal.set("From first");
//                for (int i = 0; i < 100; i++) {
//                    System.out.println(threadLocal.get() + " " + i / 0);
//                    try {
//                        throw new Exception();
//                    } catch (Exception e) {
//                        System.out.println("поймали проверяемое исключение");
//                    }
//                }
//            }
//        });
//
//
//        Thread th2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 'A'; i < 100; i++) {
//                    System.out.println(this + " " + (char) i);
//                }
//            }
//        });
//        th2.setName("second");
//        th2.start();
//
//    }
//    @Override
//    public void uncaughtException(Thread t, Throwable e) {
//        System.out.println("ошибочка!!");
    }
}

