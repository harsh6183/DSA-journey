public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
        display(arr);
    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;
            j--;
        }
    }

    public static void display(int[] arr) {
        StringBuilder sb = new StringBuilder("Answer=> ");

        for (int val : arr) {
            sb.append(val + " ");    //append use for adding
        }
        System.out.println(sb);
    }

}
