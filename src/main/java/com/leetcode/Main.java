package com.leetcode;


import com.leetcode.additionalClasses.ListNode;

public class Main {
    public static void main(String[] args) {
//        ArrayList ar = new ArrayList();
//        Iterator it = ar.iterator();
//        Object[] arr = new Object[]{};
//        Optional opt = Arrays.stream(arr).findAny();
        //   int[] a = new int[]{9, 9, 9};
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(2, new ListNode(0, node2));
        node2.next = node3;
        // ListNode node2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        // ListNode node3 = new ListNode(1);
        //  ListNode node1 = new ListNode(9);
        //  ListNode node2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        //  ListNode.showListNode(EasyAlgorithms.deleteDuplicates(node));
        //      LinkedList1<String> ls = new LinkedList1();
        //     for (String a : "ff dd".split(" ")) {
        //          System.out.println(a);
        //      }
        // ListNode.showListNode(EasyAlgorithms.hasCycle(node2));
        //     Map<String, Integer> map = Map.of();

        ListNode node = new ListNode(3, node3);
        System.out.println(EasyAlgorithms.detectCycle(node));
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
//    }
//    @Override
//    public void uncaughtException(Thread t, Throwable e) {
//        System.out.println("ошибочка!!");

    }
}
