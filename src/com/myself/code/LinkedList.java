package com.myself.code;

import javafx.util.Pair;

public class LinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private int size;
    private Node head;

    public LinkedList() {
        head = new Node();
        size = 0;
    }

    //获取链表中元素的个数
    public int getSize() {
        return size;
    }

    //返回链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在链表的index(0-based)位置添加新的元素e
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed, Illegal index");
        }
        head = add(head, index, e);
        size++;
    }

    // 在以node为头结点的链表的index位置插入元素e，递归算法
    private Node add(Node node, int index, E e) {
        if (index == 0) {
            return new Node(e, node);
        }

        node = add(node.next, index - 1, e);
        return node;
    }

    // 获得链表的第index(0-based)个位置的元素
    public E get(int index) {

        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Illegal index.");

        return get(head, index);
    }

    // 在以node为头结点的链表中，找到第index个元素，递归算法
    private E get(Node node, int index) {
        if (index == 0) {
            return node.e;
        }
        return get(node.next, index - 1);
    }

    // 修改链表的第index(0-based)个位置的元素为e
    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Update failed. Illegal index.");

        set(head, index, e);
    }

    // 修改以node为头结点的链表中，第index(0-based)个位置的元素为e，递归算法
    private void set(Node node, int index, E e) {
        if (index == 0) {
            node.e = e;
            return;
        }

        set(node.next, index - 1, e);
    }

    // 查找链表中是否有元素e
    public boolean contains(E e){
        return contains(head, e);
    }

    // 在以node为头结点的链表中，查找是否存在元素e，递归算法
    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        } else if (node.e.equals(e)) {
            return true;
        }

        return contains(node.next, e);
    }

    // 从链表中删除index(0-based)位置的元素, 返回删除的元素
    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        Pair<Node, E> res = remove(head, index);
        size --;
        head = res.getKey();
        return res.getValue();
    }

    // 从以node为头结点的链表中，删除第index位置的元素，递归算法
    // 返回值包含两个元素，删除后的链表头结点和删除的值：）
    private Pair<Node, E> remove(Node node, int index) {
        if (index == 0) {
            return new Pair<>(node.next, node.e);
        }
        Pair<Node, E> res = remove(node.next, index - 1);
        node.next = res.getKey();
        return new Pair<>(node, res.getValue());
    }

    // 从链表中删除元素e
    public void removeElement(E e){
        head = removeElement(head, e);
    }

    // 从以node为头结点的链表中，删除元素e，递归算法
    private Node removeElement(Node node, E e) {
        if (node == null) {
            return null;
        }
        if (node.e.equals(e)) {
            size--;
            return node.next;
        }
        node.next = removeElement(node.next, e);
        return node;
    }
}
