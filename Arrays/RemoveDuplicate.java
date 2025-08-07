import java.util.HashSet;
//Remove the duplicates from the Array
public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr= {3,5,7,3,1,6,3,4,6,5,6,0,8};
        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr){
            hs.add(num);  //HashSet Automatically removes the duplicate
        }

        System.out.println(hs+" ");
    }
}

//Time complexity O(N),Space O(1)
