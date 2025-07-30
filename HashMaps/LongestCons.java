//In the Given array find the longest consecutives present and return the output length
//input =[274986930]  Longest Cons = [6789]  output lenght = 4

//Leetcode que 128 done

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

            int [] length = new int[maxlength];
            for(int i =0; i<maxlength;i++){
                length[i]= maxlength +i;
                
            }

            for (int num :length){
                System.out.println(num+"");
            }

            System.out.println("Longest sequence length=>" +length.length);
        }
    }


// for only getting longest consecutive just change the last loop and remove the last array made
// for(int i =0; i<maxlength;i++){
            //     system.out.println(maxlength +i)

            // }