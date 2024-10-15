package leetCode.reverseList;

import leetCode.util.ListNode;

public class Solution {
    public static ListNode reverseList(ListNode head) {

        ListNode prv = null;
        //遍历原来的每一个节点
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prv;
            prv = curr;
            curr = next;
        }
        return prv;
    }

    public static void main(String[] args) {
        int[] nu = {1,2,3,4,5};
        ListNode.listToListNodeList(nu);
    }
}
