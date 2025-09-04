// 443 Leet code String Compression
//Give array 
//Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3"

public class ArrayCompression {
    public int compress(char[] chars) {
        if (chars.length == 0)
            return 0;

        StringBuilder s = new StringBuilder();
        s.append(chars[0]);
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            char current = chars[i];
            char previous = chars[i - 1];

            if (current == previous) {
                count++;
            } else {
                if (count > 1) {
                    s.append(count);
                }
                s.append(current);
                count = 1;
            }
        }
        if (count > 1) {
            s.append(count);
            count = 1;
        }
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i); // Copy compressed string back to original char array
        }
        return s.length();
    }
}
