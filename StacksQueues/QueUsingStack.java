// Implement Queue using Stack use only(pop,push,empty,add)
//Input push {2,3,5,6,7} Output when pop it should give FIFO orLILO 2 ,3,4,5,6

import java.util.Scanner;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

  
    public void push(int x) {
        s1.push(x);
    }

    
    public int pop() {
        shiftStacks();
        return s2.pop();
    }


    public int peek() {
        shiftStacks();
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

   
    private void shiftStacks() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }
}

public class QueUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        MyQueue q = new MyQueue();

        for (char ch : input.toCharArray()) {
            int digit = Character.getNumericValue(ch);
            q.push(digit);
        }

        System.out.print("Queue output: ");
        while (!q.empty()) {
            System.out.print(q.pop() + " ");
        }

        sc.close();
    }
}
