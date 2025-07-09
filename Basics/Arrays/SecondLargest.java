//Find second largest element from the given array

/*import java.util.Arrays;   This solution is not acceptable its direct method

public class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,8};
        Arrays.sort(arr);

        int largest = arr[arr.length-2];

        System.out.println(largest);

    }
}*/

//Solution 2

import java.util.Arrays;

public class SecondLargest{
    public static void main(String[] args) {
        int [] arr = {4,2,1,7,3,5,8,8};
        Arrays.sort(arr);

        int largest=arr[arr.length-1];
        int secondl = 0;

        for(int i = arr.length-2;i>=0;i--){
            if(arr[i]!=largest){

                secondl= arr[i];
                break;
                
            }
        }

        System.out.println(secondl);

    }
}

//Time complexity = O(n)