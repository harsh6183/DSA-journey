//Leetcode Hard 25th problem 
//Reverse the LinkedList nodes by Kth grps

public class ReverseNode {
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

    public int len(ListNode head){
        int counter=0;
        while(head!=null){
            counter ++;
            head=head.next;
        } 
        return counter;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int n = len(head);
        int grps = n/k;
        ListNode prevHead = null;
        ListNode currentHead = head;
        ListNode ansNode = null;
        
        for(int i =0;i<grps;i++){
            ListNode prev = null;
            ListNode current =currentHead;
            ListNode nextNode = null;

            for(int j=0;j<k;j++){
                nextNode = current.next;
                current.next =prev;
                prev = current;
                current = nextNode;
            }
            if(prevHead ==null){
                ansNode = prev;
            }else{
                prevHead.next =prev;
            }
            prevHead = currentHead;
            currentHead =current;
        }
        prevHead.next=currentHead;
        return ansNode;
    }
}
