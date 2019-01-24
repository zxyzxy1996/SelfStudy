package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Demo173 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    Queue<Integer> queue = new LinkedList<>();

    public Demo173(TreeNode root) {
        find(root);
    }

    public int next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return queue.size() != 0;
    }

    private void find(TreeNode node) {
        if (node == null) {
            return;
        }
        find(node.left);
        queue.offer(node.val);
        find(node.right);
    }
//    Queue<Integer> queue = new LinkedList<>();
//
//    public Demo173(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//        if (root == null) {
//            throw new IllegalArgumentException("Error root");
//        }
//        TreeNode cur = root;
//        while (cur != null || !stack.isEmpty()) {
//            if (cur != null) {
//                stack.push(cur);
//                cur = cur.left;
//            } else {
//                cur = stack.pop();
//                queue.add(cur.val);
//                cur = cur.right;
//            }
//        }
//    }
//
//    /**
//     * @return the next smallest number
//     */
//    public int next() {
//        return queue.remove();
//    }
//
//    /**
//     * @return whether we have a next smallest number
//     */
//    public boolean hasNext() {
//        return !queue.isEmpty();
//    }
}
