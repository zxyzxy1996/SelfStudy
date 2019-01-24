package com.imooc.datastructure.map;

import com.imooc.datastructure.set.FileOperation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String fileName = "Pride And prejudice.txt";

        BSTMap<String, Integer> map1 = new BSTMap<>();
        double time1 = testMap(map1, fileName);
        System.out.println("BST Map: " + time1 + " s");
        System.out.println();

        LinkedListMap<String, Integer> map2 = new LinkedListMap<>();
        double time2 = testMap(map2, fileName);
        System.out.println("BST Map: " + time2 + " s");
        System.out.println();
    }

    private static double testMap(Map<String, Integer> map, String fileName) {

        long startTime = System.nanoTime();
        System.out.println("Pride and Prejudice");

        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("Pride And prejudice.txt", words)) {
            System.out.println("Total words: " + words.size());
        }
        for (String word : words) {
            if (map.contains(word)) {
                map.set(word, map.get(word) + 1);
            } else {
                map.add(word, 1);
            }
        }

        System.out.println("Total different words: " + map.getSize());
        System.out.println("Frequency of Pride: " + map.get("pride"));
        System.out.println("Frequency of Prejudice: " + map.get("prejudice"));

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }
}
