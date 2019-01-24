package com.leetcode;

public class Demo203 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            while (head != null && head.val == val) {
                ListNode delNode = head;
                head = head.next;
                delNode.next = null;
            }

            if (head == null) {
                return null;
            }

            ListNode prev = head;
            while (prev.next != null) {
                if (prev.next.val == val) {
                    ListNode delNode = prev.next;
                    prev.next = delNode.next;
                    delNode.next = null;
                } else {
                    prev = prev.next;
                }
            }
            return head;
        }
    }

    class Solution2 {
        public ListNode removeElements(ListNode head, int val) {

            ListNode dummyHead = new ListNode(520);
            dummyHead.next = head;

            ListNode prev = dummyHead;
            while (prev.next != null) {
                if (prev.next.val == val) {
                    prev.next = prev.next.next;
                } else {
                    prev = prev.next;
                }
            }
            return dummyHead.next;
        }
    }

    //递归方法。
    class Solution3 {
        public ListNode removeElements(ListNode head, int val) {

            //问题规模最小的解
            if (head == null) {
                return null;
            }

            //把原问题转换成更小的问题
            head.next = removeElements(head.next, val);
//            if (head.val == val) {
//                return head.next;
//            } else {
//                return head;
//            }
            return head.val == val ? head.next : head;
        }
    }
}
