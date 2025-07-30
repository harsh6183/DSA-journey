//In the Given array find the longest consecutives present
//input =[274986930]  Longest Cons = [6789]

import java.util.HashMap;
import java.util.Scanner;

public class LongestCons {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

            HashMap<Integer, Boolean> hm = new HashMap<>();
            for (int val : arr){
                hm.put(val,true);
            }
            for (int val : arr){
                if (hm.containsKey(val-1)) {
                    hm.put(val,false);
                    
                }
            }

            int mstartpoint = 0;
            int maxlength =0;
            for(int val:arr){
                if(hm.get(val)==true){
                    int tstartlength = 1;
                    int tstartpoint = val;

                    while(hm.containsKey(tstartpoint+tstartlength)){
                        tstartlength++;
                    }

                    if (tstartlength>maxlength) {
                        maxlength=tstartlength;
                        mstartpoint=tstartpoint;
                    }
                }
            }

            for(int i =0; i<maxlength;i++){
                System.out.println(mstartpoint+i);
            }
        }
    }


