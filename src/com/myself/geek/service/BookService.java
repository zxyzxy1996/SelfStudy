package com.myself.geek.service;

import java.util.Date;

public interface BookService {
    void lendOut(String bookId, String userId, Date date);
}
