package com.imooc.datastructure.array;

import com.imooc.datastructure.linkedlist.LinkedListStack;

public class Main {

    public static void main(String[] args) {
        LinkedListStack<Integer> linkedList = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            linkedList.push(i);
            System.out.println(linkedList);
        }

        System.out.println(linkedList.peek());


        linkedList.pop();
        System.out.println(linkedList);
    }
}
