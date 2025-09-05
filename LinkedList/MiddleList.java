//Find the middle of the Linkedlist 
//LeetCode 876 problem

package LinkedList;

public class MiddleList {
     int val;
       MiddleList next;
       MiddleList() {}
       MiddleList(int val) { this.val = val; }
       MiddleList(int val, MiddleList next) { this.val = val; this.next = next; }

       //solution
    public MiddleList middleNode(MiddleList head) {
        MiddleList first = head;
        MiddleList second = head;

        while(first!=null && first.next!=null){
            second = second.next;
            first = first.next.next;
        }

        return second;
    }
}

