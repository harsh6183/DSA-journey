//Print the Comman Element which has repeated of the given set
//Input a1= [1,2,2,4,5,5,6,6,6] a2=[1,2,2,3,4,3,4,6,6]
//Output =[2,2,6,6]

import java.util.HashMap;
import java.util.Scanner;

public class GetEle {
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
                int of =freqmap.get(val); //old frequency
                int nf = of+1;              //new frequency
                freqmap.put(val,nf);
            }else{
                freqmap.put(val,1);
            }
        }

        // for arr2 now comparision

        for(int val:arr2){
            if(freqmap.containsKey(val) && freqmap.get(val)>0){
                System.out.println(val);
                 int of =freqmap.get(val); //old frequency
                int nf = of-1;              //new frequency
                freqmap.put(val,nf);
            }
        }
    }
}
