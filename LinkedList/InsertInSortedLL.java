//Insert in the Sorted LL
//If given LL is 10-12-15-18-20
//k=14
//Output= 10-12-14-15-18-20

public class InsertInSortedLL {
    InsertInSortedLL sortedInsert (Node head1 ,int k){
        Node newNode = new Node(k);
        Node prev = null;
        Node temp = head1;
        while(temp!=null){
            if(tem.data=k){
                break;
            }
            prev = temp;
            temp = tem.next;
        }
        if(prev ==null){
            newNode.next = head1;
            head1=newNode;
        }else{
            newNode.next = prev.next;
            prev.next = newNode;
        }
        return head1;
    }
}
