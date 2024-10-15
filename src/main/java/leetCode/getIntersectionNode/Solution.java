package leetCode.getIntersectionNode;

import leetCode.util.ListNode;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummyA = headA;
        ListNode dummyB = headB;
        while (dummyA !=dummyB){
            dummyA = dummyA ==null ?headB : dummyA.next;
            dummyB = dummyB ==null ?headA : dummyB.next;
        }
        return dummyA;

    }

    public static void main(String[] args) {

    }
}
