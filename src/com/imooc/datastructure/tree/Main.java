package com.imooc.datastructure.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int[] nums = {10, 5, 7, 9, 8, 6, 3};

        for (int num : nums) {
            bst.add(num);
        }

        System.out.println(bst);
    }
}
