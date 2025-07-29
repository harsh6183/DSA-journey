//Check the Frequency of the Character how many times they appear using HashMap

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCheck{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        HashMap<Character,Integer>hm=new HashMap<>();
        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int of = hm.get(ch); //old frequency
                int nf =of+1;          //New frequency
                hm.put(ch,nf);
            } else{
                hm.put(ch,1);
            }
            
        }

        char mfc = str.charAt(0);
        for (Character key :hm.keySet()){
            if(hm.get(key)>hm.get(mfc)){
                mfc=key;
            }
        }

        System.out.println(mfc);
    }
}