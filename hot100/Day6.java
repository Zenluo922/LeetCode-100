package hot100;

import java.util.ArrayList;
import java.util.List;

public class Day6 {
    class Solution{
        public List<List<Integer>> threeSum(int[] nums) {
            int i = 0;
            int j = nums.length;
            int t = 0;
            while (i < j) {
                for (t = i + 1; t < j; t++) {
                    if (nums[i] + nums[t] + nums[j] != 0) {
                        i++;
                        j--;
                    }
                }
            }
            return new ArrayList<>();
        }
    }
}
