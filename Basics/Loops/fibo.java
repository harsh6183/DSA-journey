//Fibonacci series printing
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int a=0;
    int b=1;

     for(int i=0;i<n;i++){
        System.out.println(a);
        int c=a+b;
        a=b;
        b=c;
    }
    
    }

}

//Time Com is O(N)
