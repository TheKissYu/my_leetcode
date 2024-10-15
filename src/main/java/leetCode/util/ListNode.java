package leetCode.util;

public class ListNode {
     public int val;
     public ListNode next;
     public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode listToListNodeList(int[] nums){
         ListNode head =  new ListNode();
         ListNode next = head;
         for (int i = 0; i < nums.length ; i++) {
             next.next =new ListNode();
             next = next.next;
             next .val = nums[i];
         }
         return head.next;
     }
}
