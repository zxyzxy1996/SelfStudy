package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Demo589 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null)
            return res;

        res.add(root.val);
        for(Node child : root.children){
            preorder(child);
        }
        return res;
    }
}
