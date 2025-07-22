public class Permutation {

    public static void main(String[] args) {
        String input = "123";
        permutation("",input);
    }

        public static void permutation(String s1, String s2) {
        if (s2.isEmpty()){
            System.out.println(s1);
            return;
        }

        char ch = s2.charAt(0);
        for(int i = 0; i<=s1.length();i++){
            String f = s1.substring(0,i);
            String s = s1.substring(i);
            permutation(f+ch+s,s2.substring(1));
        }
    }

    
}
