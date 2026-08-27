import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        int ans = -1;

        for (int x : nums) {
            if (x % 2 == 0) {
                int count = freq.getOrDefault(x, 0) + 1;
                freq.put(x, count);

                if (count > maxFreq) {
                    maxFreq = count;
                    ans = x;
                } else if (count == maxFreq) {
                    ans = Math.min(ans, x);
                }
            }
        }

        return ans;
    }
}