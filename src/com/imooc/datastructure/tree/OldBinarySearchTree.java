package com.imooc.datastructure.tree;

public class OldBinarySearchTree<E extends Comparable<E>> {
    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public OldBinarySearchTree() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //向二分搜索树中添加新的元素e
    public void add(E e) {
        if (root == null) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }

    //向以node为根的二分搜索树中插入元素E，递归算法
    private void add(Node node, E e) {
        if (e.equals(node.e)) {
            return;
        } else if (e.compareTo(node.e) < 0 && node.left != null) {
            node.left = new Node(e);
            size++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right != null) {
            node.right = new Node(e);
            size++;
            return;
        }

        if (e.compareTo(node.e) < 0) {
            add(node.left, e);
        } else {
            add(node.right, e);
        }
    }

    //非递归添加操作
    public void unReAdd(E e){
        if (root == null) {
            root = new Node(e);
            size++;
        }

        Node node = null;
        Node cur = root;

        while (cur != null){
            if (e.equals(cur.e)) {
                return;
            }
            node = cur;

            if (e.compareTo(cur.e) < 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }

        if (e.compareTo(node.e) < 0) {
            node.left = new Node(e);
            size++;
        } else {
            node.right = new Node(e);
            size++;
        }
    }
}
