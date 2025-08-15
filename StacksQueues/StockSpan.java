// Stock span question leetcode 901
//Input array = {100,80,60,70,60,75,85} output span ={1,1,1,2,1,4,6}

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int [] prices = {100,80,60,70,60,75,85};
        StockSpan ss = new StockSpan();
        int [] output = ss.calculateSpans(prices);
        System.out.println("output is =>"+ Arrays.toString(output)); 
    }

    public int [] calculateSpans (int [] prices){
        int [] span = new int [ prices.length];
        span [0] =1;

        Stack<Integer> indexStack = new Stack<>();
        indexStack.push (0);
        
        for(int i = 1 ; i<prices.length;i++){
            while(!indexStack.isEmpty()&& prices[indexStack.peek()]<=prices[i]){
                indexStack.pop();
            }

            if(indexStack.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-indexStack.peek();
            }
             indexStack.push(i);

        }
        return span;
    }
}

//Time complexity = O(n)