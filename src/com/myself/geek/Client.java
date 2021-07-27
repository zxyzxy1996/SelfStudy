package com.myself.geek;

import com.myself.geek.handler.ServiceInvocationHandler;
import com.myself.geek.service.BookService;
import com.myself.geek.service.BookServiceImpl;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
//        BookService bookService = (BookService) Proxy.newProxyInstance(BookService.class.getClassLoader(),
//                new Class[]{BookService.class},
//                new ServiceInvocationHandler(new BookServiceImpl()));
//
//        bookService.lendOut("123", "456", new Date());

        BigDecimal bigDecimal = new BigDecimal(2);

        long start, end = 0;
        start = System.currentTimeMillis();
        String l = bigDecimal.pow(63).subtract(new BigDecimal(1)).toPlainString();
        end = System.currentTimeMillis();
        System.out.printf("耗时%d毫秒%n", (end - start));
        System.out.println(l);
    }
}
