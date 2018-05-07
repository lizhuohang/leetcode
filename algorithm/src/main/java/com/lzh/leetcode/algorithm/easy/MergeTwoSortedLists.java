package com.lzh.leetcode.algorithm.easy;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 15:58 18/2/2
 */
public class MergeTwoSortedLists {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//
//        ListNode node = new ListNode(0);
//        if (l1.val < l2.val) {
//            node.val = l1.val;
//            node.next = mergeTwoLists(l1.next, l2);
//        } else {
//            node.val = l2.val;
//            node.next = mergeTwoLists(l1, l2.next);
//        }
//        return node;
//    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode node = new ListNode(0);
        if (l1.val <= l2.val) {
            node.val = l1.val;
            node.next = mergeTwoLists(l1.next, l2);
        } else {
            node.val = l2.val;
            node.next = mergeTwoLists(l1, l2.next);
        }
        return node;
    }
}
