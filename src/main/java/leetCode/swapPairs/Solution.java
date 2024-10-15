package leetCode.swapPairs;


import leetCode.util.ListNode;

public class Solution {

    public static ListNode swapPairs(ListNode head) {
         ListNode node  = new ListNode();
         node.next  = head;
         ListNode tmp = node;
         while (tmp.next !=null && tmp.next.next != null){
             ListNode next = tmp.next;
             ListNode nextN = tmp.next.next;
             tmp.next = nextN;
             next.next = nextN.next;
             nextN.next = next;
             tmp = next;
         }
         return node.next;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ListNode listNode =  ListNode.listToListNodeList(nums);
        ListNode listNode1 = swapPairs(listNode);
        System.out.println(listNode1);
    }
}
