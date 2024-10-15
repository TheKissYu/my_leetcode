package leetCode.removeElements;

import leetCode.util.ListNode;

public class Solution {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode first = new ListNode();
        first.next = head;
        ListNode now = first;
        while(now.next !=null){
            if(now.next.val == val){
                now.next = now.next.next;
            }else {
                now = now.next;
            }
        }
        return first.next;
    }

    public static void main(String[] args) {
        int[] num = {7,7,7,7};
        removeElements(ListNode.listToListNodeList(num),7);
    }
}
