package com.leetcode;

import java.util.Stack;

public class Demo965 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //    public boolean isUnivalTree(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty() && root != null) {
//            TreeNode cur = stack.pop();
//            if (cur.val != root.val) {
//                return false;
//            }
//            if (cur.right != null) {
//                stack.push(cur.right);
//            }
//            if (cur.left != null) {
//                stack.push(cur.left);
//            }
//        }
//        return true;
//    }
    public boolean isUnivalTree(TreeNode root) {
        return isBoolean(root, root.val);
    }

    private boolean isBoolean(TreeNode node, int value) {
        if (node == null) {
            return true;
        }
        return node.val == value && isBoolean(node.left, value) && isBoolean(node.right, value);
    }
}
