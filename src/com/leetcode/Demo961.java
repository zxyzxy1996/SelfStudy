package com.leetcode;

import java.util.*;

public class Demo961 {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                if (map.get(A[i]) > 0)
                return A[i];
            } else {
                map.put(A[i], 1);
            }
        }

        return 0;
    }
//    public int repeatedNTimes(int[] A) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int num : A) {
//            if (map.containsKey(num)) {
//                map.put(num, map.get(num) + 1);
//            } else {
//                map.put(num, 1);
//            }
//        }
//
//        List<HashMap.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
//        System.out.println(list.toString());
//        Collections.sort(list, new Comparator<HashMap.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o2.getValue() - o1.getValue();
//            }
//        });
//
//        return list.get(0).getKey();
//    }
}
