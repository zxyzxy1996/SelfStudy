package com.imooc.datastructure.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.addFirst(i);
        }

        queue.removeElement(4);

        System.out.println(queue);
    }
}
