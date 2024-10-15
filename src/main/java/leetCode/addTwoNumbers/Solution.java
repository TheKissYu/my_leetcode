package leetCode.addTwoNumbers;

import leetCode.util.ListNode;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if(l1 == null && l2 == null&&carry > 0){
                cur.next = new ListNode(carry);
            }
        }
        return head.next;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,4,3};
        int[] nums2 = new int[]{5,6,4};
        ListNode l1 = ListNode.listToListNodeList(nums);
        ListNode l2 = ListNode.listToListNodeList(nums2);
        System.out.println(addTwoNumbers(l1, l2));
    }
}
