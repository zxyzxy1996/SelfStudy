package com.myself.code;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

/**
 * @author zheng xinyu
 * @date 2021/4/6 13:34
 */
public class Async {

    public static CompletableFuture<String> asyncDemo(String val, int i) {
        return CompletableFuture.supplyAsync(() -> val + "=" + i);
    }

    public static void method(String val, int i) {
        CompletableFuture<String> stringCompletableFuture = asyncDemo(val, i);
        privateMethod(val, i , stringCompletableFuture);
    }

    private static void privateMethod(String val, int i, CompletableFuture<String> completableFuture) {
        completableFuture.whenCompleteAsync((s, throwable) -> {
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s + "=" + i + "---" + val);
        });

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("----------------START---------------");

        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread, "线程1");
        Thread thread2 = new Thread(myThread, "线程2");
        Thread thread3 = new Thread(myThread, "线程3");
        Thread thread4 = new Thread(myThread, "线程4");
        Thread thread5 = new Thread(myThread, "线程5");
        Thread thread6 = new Thread(myThread, "线程6");
        Thread thread7 = new Thread(myThread, "线程7");
        Thread thread8 = new Thread(myThread, "线程8");
        Thread thread9 = new Thread(myThread, "线程9");
        Thread thread10 = new Thread(myThread, "线程10");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

        System.out.println("----------------END---------------");

        Thread.sleep(100000);
    }
}
