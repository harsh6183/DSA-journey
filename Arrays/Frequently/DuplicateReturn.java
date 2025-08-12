import java.util.HashSet;

public class DuplicateReturn {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 6, 8, 4 };
        int[] arr2 = { 2, 3, 8, 7, 9 };
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) 
            set.add(num);
            for (int num : arr2) {
               if (set.contains(num)) {
                System.out.println(num);
               } 
                
            }
    }

}
