package com.leetcode;

public class Demo617 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
//    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        if (t1 != null && t2 != null) {
//            t1.val = t1.val + t2.val;
//            t1.left = mergeTrees(t1.left, t2.left);
//            t1.right = mergeTrees(t1.right, t2.right);
//            return t1;
//        }
//
//        return t1 == null ? t2 : t1;
//    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;

        t1.left = mergeTrees(t1.left, t2 != null ? t2.left : null);
        t1.right = mergeTrees(t1.right, t2 != null ? t2.right : null);
        return t1;
    }
}
