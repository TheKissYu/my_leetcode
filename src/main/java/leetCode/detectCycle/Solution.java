package leetCode.detectCycle;

import leetCode.util.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode low = head;
        ListNode fast = head;
        while (fast != low){
            if (fast.next != null && fast.next.next!=null){
                fast = fast.next.next;
                low = low.next;
            }else {
                return null;
            }
        }
        fast = head;
        while (low != head){
            fast = fast.next;
            head = head.next;
        }
        return fast;
    }
}
