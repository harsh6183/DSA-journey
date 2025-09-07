//Reverse the given linkedlist
// 1 => 2 => 3 => 4 =>
//output = 4 =>3 =>2 =>1

package LinkedList;

import LinkedList.AddTwoList.ListNode;

public class ReverseLL {
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
 
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        
        while(current!=null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}

