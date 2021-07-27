package com.myself.code;

/**
 * @author zheng xinyu
 * @date 2021/4/6 15:59
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  Work...");
        for (int i = 0; i < 10; i++) {
            Async.method(Thread.currentThread().getName(), i);
        }
        System.out.println(Thread.currentThread().getName() + "  Sleep...");
    }
}
