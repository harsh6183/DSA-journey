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

/*import java.util.Arrays;

public class SecondLargest{
    public static void main(String[] args) {
        int [] arr = {4,2,1,7,3,5,8,8};
        Arrays.sort(arr);  //Step 1 

        int largest=arr[arr.length-1];
        int secondl = 0;

        for(int i = arr.length-2;i>=0;i--){ //step 2
            if(arr[i]!=largest){

                secondl= arr[i];
                break;
                
            }
        }

        System.out.println(secondl);

    }
}
*/
//Time complexity = O(n long n + n) Which is not good solution so lets try another one

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 5, 10};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element found");
        } else {
            System.out.println("Second Largest Distinct Element: " + second);
        }
    }
}

//Time complexity = O(n) and Space=O(1)