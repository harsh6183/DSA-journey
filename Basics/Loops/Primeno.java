import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int t = scn.nextInt();

        for(int i=0; i<t;i++){
            int n = scn.nextInt();
            int count =0;

            for(int div=2;div*div <=n; div++){
                if(n% div ==0){
                    count++;
                }
            }

            if(count ==0){
                System.out.println(n + " :This number is Prime number");
            }else{
                System.out.println(n + " :This number is not a prime number");
            }
        }
    }
    
}

//Time complexity is O(rootN)