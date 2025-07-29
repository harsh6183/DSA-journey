//Print the Comman Element of the given set
//Input a1= [1,2,3,4,5,9] a2=[1,2,2,3,4,3,4,6,6]
//Output =[1,2,3,4]

import java.util.HashMap;
import java.util.Scanner;

public class GetCommanElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();  //Take n1 input
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=scn.nextInt();  //fill the n1 array
        }
        int n2 = scn.nextInt();     //Take n2 input
        int[] arr2 = new int[n2];  
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=scn.nextInt();  //fill the n2 array
        }

        HashMap<Integer,Integer> freqmap = new HashMap<>();
        for (int val: arr1) {
            if(freqmap.containsKey(val)){
                int of =freqmap.get(val);
                int nf = of+1;
                freqmap.put(val,nf);
            }else{
                freqmap.put(val,1);
            }
        }

        // for arr2 now comparision

        for(int val:arr2){
            if(freqmap.containsKey(val)){
                System.out.println(val);
                freqmap.remove(val);
            }
        }
    }
}
