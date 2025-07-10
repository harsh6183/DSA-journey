//Remove duplicates from the sorted array

//Using two pointers approach the solution will be more optimal

public class RemoveDupfromSorArr {
    public static void main(String[] args) {
        int[] arr = {1,2,2,8,8,9};

        int i = 0;
        for(int j=1;j<arr.length; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]= arr[j];
                i++;

            }
        }
        for (int k = 0; k <= i; k++) {   //To print the array removing the duplicate
    System.out.print(arr[k] + " ");
}
    } 
}
