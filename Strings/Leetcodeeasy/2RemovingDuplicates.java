class Main {
    public static void main(String[] args) {
        String str = "Programming";
        
        StringBuilder sb= new StringBuilder();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int index = str.indexOf(ch,i+1); //checking if the char is present in another postion or not
            if(index==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}


//Approach 2

import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "Programming";
        
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        
        for (Character c : set) {
            sb.append(c);
        }
        
        System.out.println(sb);
    }
}
