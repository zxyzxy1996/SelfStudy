package com.myself.geek.service;

import java.text.MessageFormat;
import java.util.Date;

public class BookServiceImpl implements BookService {

    @Override
    public void lendOut(String bookId, String userId, Date date) {
        System.out.println(MessageFormat.format("{0}:The book {1} is lent to {2}", bookId, userId, date));
    }
}
