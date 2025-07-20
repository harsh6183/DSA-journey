import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<arr.length;i++){
            arr[i]=scn.nextInt();        
        } disArr(arr,0);
}

public static void disArr(int []arr , int index){
    if (index==arr.length) {
        return; 
    }

    System.out.println(arr[index]);
    disArr(arr, index+1);
}
}
