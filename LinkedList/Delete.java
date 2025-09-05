//Delete the middle of the list 
//Leetcode 2076 problem

package LinkedList;

public class Delete {
    public Delete DeleteNode(Delete head) {

        if (head == null) {
            return head;
        }
        Delete first = head;
        Delete second = head;
        Delete previous = null;

        while (first != null && first.next != null) {
            previous = second;
            second = second.next;
            first = first.next.next;
        }

        if (previous == null) {
            head = null;
        } else {
            previous = second.next;
            second.next = null;
        }

        return second;
    }
}
