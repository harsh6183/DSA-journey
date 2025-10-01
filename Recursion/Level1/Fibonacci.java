import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i =0; i<=n;i++){
            System.out.println(fibo(i));
        }
        
    }

    public static int fibo(int n){
       if(n<=1){
        return n;
       }
        int res = fibo(n-1) + fibo(n-2);
        return res;
    }
}
