//Print permutation 

import java.util.Scanner;

public class Permutation{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        permutation(s.toCharArray(),0);
    }

    public static void permutation(char [] ar, int fi ){
        if (fi == ar.length-1){
            System.out.println(ar);
        } for(int i =fi;i<ar.length;i++){
            swap(ar, i, fi);
            permutation(ar, fi+1);
            swap(ar, i, fi);
        }
    }

    public static void swap(char [] ar, int i , int fi){
        char tem =ar[i];
        ar[i]= ar[fi];
        ar[fi]=tem; 
    }
}