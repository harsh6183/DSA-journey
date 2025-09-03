//Left rotate the array by 1 place

import java.util.Arrays;

public class Leftrotate {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int n = 2;
        n = n % array.length;

        for (int r = 0; r < n; r++) {
            int tem = array[0];

            for (int i = 1; i < array.length; i++) {
                array[i - 1] = array[i];
            }

            array[array.length - 1] = tem;
        }
        System.out.println(Arrays.toString(array));
    }

}

// Time complexity= O(n*n) and space =O(n)
