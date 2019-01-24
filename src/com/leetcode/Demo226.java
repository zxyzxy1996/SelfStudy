package com.leetcode;

public class Demo226 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode treeNode = root.left;

        root.left = invertTree(root.right);
        root.right = invertTree(treeNode);

        return root;
    }
}

