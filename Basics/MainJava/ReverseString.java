
public class ReverseString {
    public static void main(String[] args) {
        String keys = "ABCD";
        String rev = "";
        char a[] = keys.toCharArray();
        int length = a.length;

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + a[i];
        }

        System.out.println(rev);
    }

}
