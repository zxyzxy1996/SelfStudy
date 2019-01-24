package com.leetcode;

import java.util.*;

public class Demo347 {

    private class Freq {

        int e, freq;

        public Freq(int e, int freq) {
            this.e = e;
            this.freq = freq;
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {

        //统计频次
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }

        //利用优先队列求出前k个元素
        PriorityQueue<Freq> pq = new PriorityQueue<>(new Comparator<Freq>() {
            @Override
            public int compare(Freq a, Freq b) {
                return a.freq - b.freq;
            }
        });
        for (int key : hashMap.keySet()) {
            if (pq.size() < k) {
                pq.offer(new Freq(key, hashMap.get(key)));
            } else if (hashMap.get(key) > pq.peek().freq) {
                pq.poll();
                pq.offer(new Freq(key, hashMap.get(key)));
            }
        }

        //放入list中返回
        LinkedList<Integer> list = new LinkedList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll().e);
        }

        return list;
    }
}
