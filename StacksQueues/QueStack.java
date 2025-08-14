// Implement Queue using Stack use only(pop,push,empty,add)
//Input push {2,3,5,6,7} Output when pop it should give FIFO orLILO 2 ,3,4,5,6

import java.util.Stack;

public class QueStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);

        Stack <Integer> st2 = new Stack<>();
        st2.push(st1.pop());
        st2.push(st1.pop());
        st2.push(st1.pop());
        st2.push(st1.pop());
        
        st1.push(st2.pop());
        st1.push(st2.pop());
        st1.push(st2.pop());
        st1.push(st2.pop());
        System.out.println(st1);
        
    }
}
