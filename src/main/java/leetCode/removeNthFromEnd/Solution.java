package leetCode.removeNthFromEnd;

import leetCode.util.ListNode;

public class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode firstNode = dummyNode;
        ListNode secondNode = dummyNode.next;
        int flag= 0;
        while (secondNode != null){
            secondNode = secondNode.next;
            if (flag >= n ){
                firstNode = firstNode.next;
            }else {
                flag ++;
            }
        }
        if (flag >= n){
            if(firstNode.next !=null){
                firstNode.next = firstNode.next.next;
            }
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        ListNode listNode = removeNthFromEnd(ListNode.listToListNodeList(num), 2);
        System.out.println(111);
    }

}
