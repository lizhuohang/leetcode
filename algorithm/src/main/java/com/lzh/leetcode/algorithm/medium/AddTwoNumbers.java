package com.lzh.leetcode.algorithm.medium;

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 * @Author: lizhuohang
 * @Date: Created in 17:23 18/2/2
 */
public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode tmp = node;
        int perch = 0;
        while (l1 != null || l2 != null) {
            int l1Value = 0;
            int l2Value = 0;
            if (l1 != null) {
                l1Value = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2Value = l2.val;
                l2 = l2.next;
            }
            int sum = l1Value + l2Value + perch;
            tmp.next = new ListNode(sum % 10);
            perch = sum / 10;
            tmp = tmp.next;
        }
        if (perch > 0){
            tmp.next = new ListNode(perch);
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        new AddTwoNumbers().addTwoNumbers(node1, node2);
    }

}
