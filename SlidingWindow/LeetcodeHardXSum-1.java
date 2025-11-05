
// Find X-Sum of All K-Long Subarrays I
import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Map<Integer, Integer> freq = new HashMap<>();

        // initialize first window
        for (int i = 0; i < k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        ans[0] = calcXSum(freq, x);

        // slide window
        for (int i = k; i < n; i++) {
            int out = nums[i - k];
            int in = nums[i];

            // remove outgoing
            freq.put(out, freq.get(out) - 1);
            if (freq.get(out) == 0) freq.remove(out);

            // add incoming
            freq.put(in, freq.getOrDefault(in, 0) + 1);

            ans[i - k + 1] = calcXSum(freq, x);
        }

        return ans;
    }

    // helper to compute x-sum given current frequency map
    private int calcXSum(Map<Integer, Integer> freq, int x) {
        List<int[]> items = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            items.add(new int[]{e.getKey(), e.getValue()});
        }

        // sort: higher freq first, then higher number
        items.sort((a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1];
            return b[0] - a[0];
        });

        int sum = 0;
        int count = 0;
        for (int[] p : items) {
            if (count == x) break;
            sum += p[0] * p[1];
            count++;
        }
        return sum;
    }
}
