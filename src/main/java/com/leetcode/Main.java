package com.leetcode;


import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        ArrayList ar = new ArrayList();
//        Iterator it = ar.iterator();
//        Object[] arr = new Object[]{};
//        Optional opt = Arrays.stream(arr).findAny();
        System.out.println(Stream.of("Вася", "оля", "Катя", "катя", "Вася", "Вася").map(x -> x.toUpperCase()).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));


        //  System.out.println(Arrays.stream(arr).skip(1).limit(arr.length - 1).filter(x -> x % 2 != 0).max());
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

