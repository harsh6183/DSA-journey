//Find the highest k elements means if k=3 then return highest 3 values from the given numbers.

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestEle {
    public static void main(String[] args) {
        int[] arr = {19,10,78,32,23};
        int k=3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length;i++){
            if(i<k){
                pq.add(arr[i]);
            }else{
                if(arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }


    }
}

//Time comp= O(NlogN)