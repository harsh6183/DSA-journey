//Leetcode 234 find the list is Palindrome or not

package LinkedList;

import LinkedList.AddTwoList.ListNode;

public class Palindrome {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            fast =fast.next.next;

            ListNode nextNode = slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextNode;
        }

        if(fast!=null){
             slow = slow.next;
        }
        while(slow!=null){
            if(prev.val!=slow.val){
                return false;
            }
            prev=prev.next;
            slow=slow.next;
        }
        return true;
    }
}

