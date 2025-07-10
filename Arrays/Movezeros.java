//In the given array Move all zeroes to the end

import java.util.Arrays;

public class Movezeros {

    public static void main(String[] args) {
        int[] arr = {1,0,3,0,4,5};
        int index =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            arr[index++]=arr[i];}
        }

        while(index<arr.length)
        {
            arr[index++]=0;

        }

        System.out.println(Arrays.toString(arr));
    }
    
}
