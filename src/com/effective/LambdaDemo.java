package com.effective;


import java.util.*;

/**
 * @author Zheng Xinyu
 */
public class LambdaDemo {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("asd");
        words.add("dsad");
        words.add("aaa");

        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < 200; i++) {
            map.put(i, i);
        }

        Integer key = 5;
        map.merge(key, 1, Integer::sum);

        System.out.println(map.get(4));
    }
}
