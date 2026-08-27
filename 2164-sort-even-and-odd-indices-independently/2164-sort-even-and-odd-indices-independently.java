import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evens.add(nums[i]);
            } else {
                odds.add(nums[i]);
            }
        }
        Collections.sort(evens);
        Collections.sort(odds, Collections.reverseOrder());

        int eIdx = 0, oIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = evens.get(eIdx++);
            } else {
                nums[i] = odds.get(oIdx++);
            }
        }

        return nums;
    }
}