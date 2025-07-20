//Print the mazepath using recursion

import java.util.ArrayList;
import java.util.Scanner;

public class Mazepath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String>paths = getMazepaths(1,1,n,m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazepaths(int sr,int sc,int dr, int dc){

        if(sr==dr && sc==dc){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc<dc){
            hpaths = getMazepaths(sr, sc+1, dr, dc);
        }

        if(sr<dr){
            vpaths=getMazepaths(sr+1, sc, dr, dc);
        }

        ArrayList<String>paths = new ArrayList<>();
        
        for(String hpath:hpaths){
            paths.add("h"+hpath);
        }

        for(String vpath:vpaths){
            paths.add("v"+vpath);
        }

        return paths;
    }
}
