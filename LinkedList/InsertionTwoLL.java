//Leetcode 160 Intersection of Two Linked Lists
//Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

public class InsertionTwoLL {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode t1 = headA;
       ListNode t2 = headB;

       while(t1!=t2){
        t1 = (t1==null)? headB: t1.next;
        t2 = (t2==null)? headA: t2.next;
       }
       return t1;
    }
}

