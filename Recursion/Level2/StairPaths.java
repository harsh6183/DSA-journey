

import java.util.ArrayList;
import java.util.Scanner;

public class StairPaths{
        public static void main(String[] args) throws Exception{
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            ArrayList<String>paths = getStairPaths(n);
            System.out.println(paths);
        }

        public static ArrayList<String> getStairPaths(int n ){

            if(n==0){
                ArrayList<String>bres=new ArrayList<>();
                bres.add("");
                return bres;
            }else if(n<0){
                ArrayList<String> bres = new ArrayList<>();
                return bres;
            }

            ArrayList<String> paths1= getStairPaths(n-1);
             ArrayList<String> paths2= getStairPaths(n-2);
               ArrayList<String> paths= new ArrayList<>();

               for(String path: paths1){
                paths.add(1+path);
               }

               for(String path: paths2){
                paths.add(2+path);
               }

               

               return paths;

        }
}